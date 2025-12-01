package com.todo.Todo.App.services.impl;

import com.todo.Todo.App.dto.ItemRequestDto;
import com.todo.Todo.App.dto.ItemResponseDto;
import com.todo.Todo.App.entity.Item;
import com.todo.Todo.App.exception.ResourceNotFoundException;
import com.todo.Todo.App.mapper.ItemMapper;
import com.todo.Todo.App.repository.ItemRepository;
import com.todo.Todo.App.services.ItemServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServicesImpl implements ItemServices {

    private final ItemRepository itemRepository;

    private ItemServicesImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemResponseDto addItem(ItemRequestDto dto) {
        Item item = ItemMapper.toEntity(dto);
        itemRepository.save(item);
        return ItemMapper.toDto(item);
    }

    @Override
    public List<ItemResponseDto> getAllItems() {
        return itemRepository.findAllByOrderByCreatedAtDesc().stream().map(ItemMapper::toDto).toList();
    }

    @Override
    public void deleteItem(Long id) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
        itemRepository.delete(item);
    }


}
