package com.example.myproductservice.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ProductCategories {
    @Id
    private Integer categoryId;
    private String categoryName;
}
