package com.example.myproductservice.service;

import com.example.myproductservice.model.TabA;
import com.example.myproductservice.repository.TabARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceA {

    @Autowired
    private TabARepository repository;


    public List<TabA> getListA(){
        return repository.findAll();
    }
}
