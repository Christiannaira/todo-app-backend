package com.todo.Todo.App.mapper;

import com.todo.Todo.App.dto.ItemRequestDto;
import com.todo.Todo.App.dto.ItemResponseDto;
import com.todo.Todo.App.entity.Item;

public class ItemMapper {

    public static Item toEntity(ItemRequestDto dto) {
        if (dto == null) return null;
        return new Item(dto.getTaskTitle(), dto.getTaskDescription(), dto.getPriorityLevel(), dto.getDueDate(), dto.getDueTime());
    }

    public static ItemResponseDto toDto(Item item) {
        if (item == null) return null;

        ItemResponseDto dto = new ItemResponseDto();

        dto.setId(item.getId());
        dto.setTaskTitle(item.getTaskTitle());
        dto.setTaskDescription(item.getTaskDescription());
        dto.setCreatedAt(item.getCreatedAt());
        dto.setPriorityLevel(item.getPriorityLevel());
        dto.setDueDate(item.getDueDate());
        dto.setDueTime(item.getDueTime());

        return dto;
    }

    public static void updateItem(Item entity, ItemRequestDto dto) {
        if (dto.getTaskTitle() != null) entity.setTaskTitle(dto.getTaskTitle());
        if (dto.getTaskDescription() != null) entity.setTaskDescription(dto.getTaskDescription());
        if (dto.getPriorityLevel() != null) entity.setPriorityLevel(dto.getPriorityLevel());
        if (dto.getDueDate() != null) entity.setDueDate(dto.getDueDate());
        if (dto.getDueTime() != null) entity.setDueTime(dto.getDueTime());
    }

}
