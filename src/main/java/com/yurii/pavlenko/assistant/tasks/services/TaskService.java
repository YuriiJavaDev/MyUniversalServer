package com.yurii.pavlenko.assistant.tasks.services;

import com.yurii.pavlenko.assistant.tasks.exceptions.TaskNotFoundException;
import com.yurii.pavlenko.assistant.tasks.exceptions.TasksNotFoundException;
import com.yurii.pavlenko.assistant.tasks.models.dto.TaskRequestDTO;
import com.yurii.pavlenko.assistant.tasks.models.dto.TaskResponseDTO;
import com.yurii.pavlenko.assistant.tasks.models.entity.Task;
import com.yurii.pavlenko.assistant.tasks.repositories.TaskRepository;
import com.yurii.pavlenko.assistant.tasks.validators.TaskValidator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskValidator validator;

    public TaskService(TaskRepository taskRepository, TaskValidator validator) {
        this.taskRepository = taskRepository;
        this.validator = validator;
    }

    public List<TaskResponseDTO> findAll() {
        List<Task> tasks = taskRepository.findAll();
        if (tasks.isEmpty()) {
            throw new TasksNotFoundException();
        }
        return tasks.stream()
                .map(this::toResponseDTO)
                .toList();
    }

    public TaskResponseDTO findById(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        return toResponseDTO(task);
    }

    public TaskResponseDTO create(TaskRequestDTO requestDTO) {
        return saveTask(new Task(), requestDTO);
    }

    public TaskResponseDTO update(Long id, TaskRequestDTO requestDTO) {
        Task existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        return saveTask(existingTask, requestDTO);
    }

    public void delete(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new TaskNotFoundException(id);
        }
        taskRepository.deleteById(id);
    }

    private TaskResponseDTO saveTask(Task task, TaskRequestDTO requestDTO) {
        validator.validate(requestDTO);

        task.setTitle(requestDTO.getTitle());
        task.setDescription(requestDTO.getDescription());
        task.setCompleted(requestDTO.isCompleted());

        Task savedTask = taskRepository.save(task);
        return toResponseDTO(savedTask);
    }

    private TaskResponseDTO toResponseDTO(Task task) {
        TaskResponseDTO dto = new TaskResponseDTO();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setCompleted(task.isCompleted());
        return dto;
    }
}