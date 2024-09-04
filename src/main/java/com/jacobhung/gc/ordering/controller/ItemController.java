package com.jacobhung.gc.ordering.controller;

import com.jacobhung.gc.ordering.model.*;
import com.jacobhung.gc.ordering.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllUsers() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getUserById(@PathVariable Integer id) {
        return itemService.getItemById(id);
    }

    @PostMapping
    public Item createUser(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Integer id) {
        itemService.deleteItem(id);
    }
}
