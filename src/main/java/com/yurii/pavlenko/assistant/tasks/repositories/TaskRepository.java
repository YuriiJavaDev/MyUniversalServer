package com.yurii.pavlenko.assistant.tasks.repositories;

import com.yurii.pavlenko.assistant.tasks.models.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}