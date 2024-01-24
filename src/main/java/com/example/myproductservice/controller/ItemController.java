package com.example.myproductservice.controller;

import com.example.myproductservice.dto.ItemDTO;

import com.example.myproductservice.model.Item;
import com.example.myproductservice.service.ItemService;

import org.hibernate.annotations.NotFound;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable String id)  {
       return itemService.getItemById(id);
    }
    @GetMapping("")
    public List<Item> getItemById()  {
        return itemService.getAllItem();
    }

    @PostMapping
    public void insertAllItems(@RequestBody List<ItemDTO> itemDTOList){
        itemService.insertItems(itemDTOList);
    }
}
