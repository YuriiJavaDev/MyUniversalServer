package com.yurii.pavlenko.assistant.tasks.validators;

import com.yurii.pavlenko.assistant.tasks.exceptions.ValidationException;
import com.yurii.pavlenko.assistant.tasks.models.dto.TaskRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class TaskValidator {

    public void validate(TaskRequestDTO request) {
        if (request == null) {
            throw new ValidationException("Request body cannot be null.");
        }
        if (request.getTitle() == null || request.getTitle().isBlank()) {
            throw new ValidationException("The title field cannot be empty.");
        }
    }
}