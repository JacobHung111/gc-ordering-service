package com.jacobhung.gc.ordering.controller;

import com.jacobhung.gc.ordering.common.WebErrorException;
import com.jacobhung.gc.ordering.model.*;
import com.jacobhung.gc.ordering.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

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
    public List<Item> createItem(@RequestBody List<Item> items) {
        return itemService.saveItems(items);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable(required = false) Integer id) {
        if (id == null)
            throw new WebErrorException(HttpStatus.BAD_REQUEST, "ID must be provided");
        boolean fail = !itemService.deleteItem(id);
        if (fail)
            throw new WebErrorException(HttpStatus.NOT_FOUND, "Item not found with id: " + id);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable(required = false) Integer id, @RequestBody Item item) {
        if (id == null)
            throw new WebErrorException(HttpStatus.BAD_REQUEST, "ID must be provided");
        Item i = itemService.updateItem(id, item);
        if (i == null) {
            throw new WebErrorException(HttpStatus.NOT_FOUND, "Item not found with id: " + id);
        }
        return i;
    }
}
