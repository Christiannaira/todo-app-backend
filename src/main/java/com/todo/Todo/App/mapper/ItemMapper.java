package com.todo.Todo.App.mapper;

import com.todo.Todo.App.dto.ItemRequestDto;
import com.todo.Todo.App.dto.ItemResponseDto;
import com.todo.Todo.App.entity.Item;

public class ItemMapper {

    public static Item toEntity(ItemRequestDto dto) {
        if (dto == null) return null;
        return new Item(dto.getTaskTitle(), dto.getTaskDescription());
    }

    public static ItemResponseDto toDto(Item item) {
        if (item == null) return null;

        ItemResponseDto dto = new ItemResponseDto();

        dto.setId(item.getId());
        dto.setTaskTitle(item.getTaskTitle());
        dto.setTaskDescription(item.getTaskDescription());
        dto.setCreatedAt(item.getCreatedAt());

        return dto;
    }

    public static void updateItem(Item entity, ItemRequestDto dto) {
        if (dto.getTaskTitle() != null) entity.setTaskTitle(dto.getTaskTitle());
        if (dto.getTaskDescription() != null) entity.setTaskDescription(dto.getTaskDescription());
    }

}
