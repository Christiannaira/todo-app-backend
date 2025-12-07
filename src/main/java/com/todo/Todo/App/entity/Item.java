package com.todo.Todo.App.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String taskTitle;

    @Column(nullable = true)
    private String taskDescription;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = true)
    private String priorityLevel;

    @Column(nullable = true)
    private LocalDate dueDate;

    @Column(nullable = true)
    private LocalTime dueTime;

    public Item() {}

    public Item(String taskTitle, String taskDescription, String priorityLevel, LocalDate dueDate, LocalTime dueTime) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.priorityLevel = priorityLevel;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
    }


    // It lets you run code automatically before an entity is saved to the database for the first time.
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }


    // encapsulation
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
