package com.example.myproductservice.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ProductCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    @Transient
    private String description;

    @PostLoad
    public void setDescription(){
        description  = categoryId%2==0?"even product":"odd product";

    }
}
