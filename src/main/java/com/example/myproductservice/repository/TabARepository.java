package com.example.myproductservice.repository;

import com.example.myproductservice.model.TabA;
import com.example.myproductservice.model.TabId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabARepository extends JpaRepository<TabA, TabId> {
}
