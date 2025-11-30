package com.todo.Todo.App.services;

import com.todo.Todo.App.dto.ItemRequestDto;
import com.todo.Todo.App.dto.ItemResponseDto;

public interface ItemServices {

    ItemResponseDto addItem(ItemRequestDto item);

}
