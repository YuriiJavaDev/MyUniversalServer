package com.yurii.pavlenko.assistant.tasks.exceptions;

public class TasksNotFoundException extends RuntimeException {
    public TasksNotFoundException() {
        super("Not a single task was found!");
    }
}
