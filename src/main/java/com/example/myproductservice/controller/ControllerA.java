package com.example.myproductservice.controller;


import com.example.myproductservice.model.TabA;
import com.example.myproductservice.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("aaa")
@RestController
public class ControllerA {

    @Autowired
    private ServiceA serviceA;

    @GetMapping
    public List<TabA> getListA(){
        return serviceA.getListA();
    }
}
