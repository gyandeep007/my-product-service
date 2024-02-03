package com.example.myproductservice.controller;

import com.example.myproductservice.model.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/person")
public class PersonController {

    @PostMapping
    public Person createPerson(@RequestBody Person person){

        String uuid =  UUID.randomUUID().toString();
        person.setId(uuid);
        return person;
    }
}
