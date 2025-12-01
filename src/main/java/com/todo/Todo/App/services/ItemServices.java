package com.todo.Todo.App.services;

import com.todo.Todo.App.dto.ItemRequestDto;
import com.todo.Todo.App.dto.ItemResponseDto;

import java.util.List;

public interface ItemServices {

    ItemResponseDto addItem(ItemRequestDto item);

    List<ItemResponseDto> getAllItems();

    void deleteItem(Long id);

    ItemResponseDto updateItem(Long id, ItemRequestDto item);

    ItemResponseDto getItemById(Long id);

}
