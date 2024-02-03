package com.example.myproductservice.repository;

import com.example.myproductservice.model.TabB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabBRepository extends JpaRepository<TabB,Integer> {
}
