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

    // adding an item
    @PostMapping
    public ResponseEntity<ItemResponseDto> addItem(@RequestBody ItemRequestDto item){
        ItemResponseDto addItem = itemServices.addItem(item);
        return ResponseEntity.ok(addItem);
    }

    // getting all items
    @GetMapping
    public ResponseEntity<List<ItemResponseDto>> getAllItems(){
        return ResponseEntity.ok(itemServices.getAllItems());
    }

    // deleting an item
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id){
        itemServices.deleteItem(id);
        return ResponseEntity.noContent().build();
    }

    // updating an item
    @PutMapping("/{id}")
    public ResponseEntity<ItemResponseDto> updateItem(@PathVariable Long id, @RequestBody ItemRequestDto item){
        return ResponseEntity.ok(itemServices.updateItem(id, item));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemResponseDto> getItemById(@PathVariable Long id){
        ItemResponseDto item = itemServices.getItemById(id);
        return ResponseEntity.ok(item);
    }


}
