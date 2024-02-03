package com.example.myproductservice.repository;

import com.example.myproductservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProductRepository extends JpaRepository<Product, String> {

    @Query(value = "select product_id,name from product",nativeQuery = true)
    HashMap<String,String> getProductWithName();
}
