package com.todo.Todo.App.repository;

import com.todo.Todo.App.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {


}
