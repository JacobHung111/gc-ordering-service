package com.jacobhung.gc.ordering.controller;

import com.jacobhung.gc.ordering.common.WebErrorException;
import com.jacobhung.gc.ordering.model.*;
import com.jacobhung.gc.ordering.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable(required = false) Integer id) {
        if (id == null)
            throw new WebErrorException(HttpStatus.BAD_REQUEST, "ID must be provided");
        Item item = itemService.getItemById(id);
        if (item == null)
            throw new WebErrorException(HttpStatus.NOT_FOUND, "Item not found with id: " + id);
        return item;
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable(required = false) Integer id) {
        if (id == null)
            throw new WebErrorException(HttpStatus.BAD_REQUEST, "ID must be provided");
        boolean fail = !itemService.deleteItem(id);
        if (fail)
            throw new WebErrorException(HttpStatus.NOT_FOUND, "Item not found with id: " + id);
    }
}
