package com.example.myproductservice.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class PostController {

    @GetMapping("{author-name}/post")
    public String welcome(@PathVariable("author-name") String name,@RequestBody String post ){
        return name +" created post "+post;
    }
}
