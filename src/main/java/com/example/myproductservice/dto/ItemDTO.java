package com.example.myproductservice.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemDTO {
    private String id;
    private String name;
    private String description;
    private String features;
    private double price;
    private String keywords;
    private String url;
    private String category;
    private String subcategory;
}
