package com.example.myproductservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@ToString
public class Product {
    @Id
    private String productId;
    private String name;
    private String description;
    private String unit;
    private Integer price;
}
