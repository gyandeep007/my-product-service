package com.example.myproductservice.mapper;

import com.example.myproductservice.dto.ItemDTO;
import com.example.myproductservice.model.Item;

public class RowMapper {

    public static void covertSourceToTarget(ItemDTO source, Item target){
        target.setId(source.getId());
        target.setName(source.getName());
        target.setDescription(source.getDescription());
        target.setFeatures(source.getFeatures());
        target.setPrice(source.getPrice());
        target.setKeywords(source.getKeywords());
        target.setUrl(source.getUrl());
        target.setCategory(source.getCategory());
        target.setSubcategory(source.getSubcategory());
    }
}
