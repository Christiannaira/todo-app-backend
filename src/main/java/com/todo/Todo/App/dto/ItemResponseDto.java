package com.todo.Todo.App.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ItemResponseDto {

    private Long id;
    private String taskTitle;
    private String taskDescription;
    private LocalDateTime createdAt;
    private String priorityLevel;
    private LocalDate dueDate;
    private LocalTime dueTime;

    public ItemResponseDto() {}

    public ItemResponseDto(Long id,  String taskTitle, String taskDescription, LocalDateTime createdAt, String priorityLevel, LocalDate dueDate, LocalTime dueTime) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.createdAt = createdAt;
        this.priorityLevel = priorityLevel;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
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

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalTime dueTime) {
        this.dueTime = dueTime;
    }
}
