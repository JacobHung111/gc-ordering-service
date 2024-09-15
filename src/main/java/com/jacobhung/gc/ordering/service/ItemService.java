package com.jacobhung.gc.ordering.service;

import com.jacobhung.gc.ordering.model.*;
import com.jacobhung.gc.ordering.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(Integer id) {
        return itemRepository.findById(id).orElse(null);
    }

    public List<Item> saveItems(List<Item> items) {
        return itemRepository.saveAll(items);
    }

    public boolean deleteItem(Integer id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return true;
        } else
            return false;
    }

    public Item updateItem(Integer id, Item updatedItem) {
        return itemRepository.findById(id).map(item -> {
            item.setCategory(updatedItem.getCategory());
            item.setItemNameEn(updatedItem.getItemNameEn());
            item.setItemNameZh(updatedItem.getItemNameZh());
            item.setPrice(updatedItem.getPrice());
            item.setImageUrl(updatedItem.getImageUrl());
            item.setIsIncludedDrink(updatedItem.getIsIncludedDrink());
            item.setIsNoodle(updatedItem.getIsNoodle());
            return itemRepository.save(item);
        }).orElse(null);
    }
}