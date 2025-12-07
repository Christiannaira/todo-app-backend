package com.todo.Todo.App.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class ItemRequestDto {

    private String taskTitle;

    private String taskDescription;

    private String priorityLevel;

    private LocalDate dueDate;

    private LocalTime dueTime;

    public ItemRequestDto(){}

    public ItemRequestDto(String taskTitle, String taskDescription, String priorityLevel, LocalDate dueDate, LocalTime dueTime) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.priorityLevel = priorityLevel;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
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
