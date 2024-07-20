package com.example.myproductservice;

import com.example.myproductservice.model.Author;
import com.example.myproductservice.model.Post;
import com.example.myproductservice.repository.AuthorRepository;
import com.example.myproductservice.repository.PostRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MyProductServiceApplication {

    @Autowired
     AuthorRepository authorRepository;
    @Autowired
    PostRepository postRepository;
    public static void main(String[] args) {
        SpringApplication.run(MyProductServiceApplication.class, args);
    }

    @PostConstruct
    public void insert(){
        Faker faker = new Faker();
        for(int i=1;i<=100;i++){
            Author author = new Author();
                    author.setFirstName(faker.name().firstName());
                    author.setLastName(faker.name().lastName());
           Author insertedAuthor=         authorRepository.save(author);
            List<Post> posts = new ArrayList<>();
               for (int j=1;j<10;j++){
                   Post post = new Post();
                   post.setTitle(faker.book().title());
                   post.setBody(faker.shakespeare().hamletQuote());
                   post.setAuthor(insertedAuthor);
                   post.setCreatedOn(new Date());
                   posts.add(post);
               }
               postRepository.saveAll(posts);
        }
    }
}
