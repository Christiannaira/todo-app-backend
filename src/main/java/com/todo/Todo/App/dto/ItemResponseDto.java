package com.todo.Todo.App.dto;

import java.time.LocalDateTime;

public class ItemResponseDto {

    private Long id;
    private String taskTitle;
    private String taskDescription;
    private LocalDateTime createdAt;

    public ItemResponseDto() {}

    public ItemResponseDto(Long id,  String taskTitle, String taskDescription, LocalDateTime createdAt) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
