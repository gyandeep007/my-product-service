package com.example.myproductservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myproductservice.model.Item;

public interface ItemRepository extends JpaRepository<Item,String> {
}
