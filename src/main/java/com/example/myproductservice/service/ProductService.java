package com.example.myproductservice.service;


import com.example.myproductservice.model.Product;
import com.example.myproductservice.repository.ProductCustomRepository;
import com.example.myproductservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductCustomRepository productRepository;

    public void saveProducts(List<Product> products){
        productRepository.saveProducts(products);
    }
}
