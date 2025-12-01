package com.todo.Todo.App.controller;


import com.todo.Todo.App.dto.ItemRequestDto;
import com.todo.Todo.App.dto.ItemResponseDto;
import com.todo.Todo.App.repository.ItemRepository;
import com.todo.Todo.App.services.ItemServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemServices itemServices;

    public ItemController(ItemServices itemServices) {
        this.itemServices = itemServices;
    }

    @PostMapping
    public ResponseEntity<ItemResponseDto> addItem(@RequestBody ItemRequestDto item){
        ItemResponseDto addItem = itemServices.addItem(item);
        return ResponseEntity.ok(addItem);
    }

    @GetMapping
    public ResponseEntity<List<ItemResponseDto>> getAllItems(){
        return ResponseEntity.ok(itemServices.getAllItems());
    }



}
