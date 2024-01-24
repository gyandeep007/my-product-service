package com.example.myproductservice.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Item {
    @Id
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
