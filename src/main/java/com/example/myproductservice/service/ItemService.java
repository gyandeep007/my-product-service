package com.example.myproductservice.service;

import com.example.myproductservice.dto.ItemDTO;


import com.example.myproductservice.mapper.RowMapper;
import com.example.myproductservice.model.Item;
import com.example.myproductservice.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityNotFoundException;

@Service
public class ItemService {

    private Logger logger = LoggerFactory.getLogger(ItemService.class);

    ItemRepository itemRepository;

    @Autowired
    public ItemService( ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item getItemById(String id)  {
        return itemRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    public List<Item> getAllItem(){
        return itemRepository.findAll();
    }
    public void insertItems(List<ItemDTO> itemDTOList){
        List<Item> items = new ArrayList<>();
        for (ItemDTO itemDTO:itemDTOList){
            Item item = new Item();
            RowMapper.covertSourceToTarget(itemDTO,item);
            items.add(item);
        }
        int updatedRecord = itemRepository.saveAllAndFlush(items).size();
        logger.info("{} items record updated",updatedRecord);
    }


}
