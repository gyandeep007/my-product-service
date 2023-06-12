package com.example.myproductservice.controller;

import com.example.myproductservice.model.ProductCategories;
import com.example.myproductservice.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class ProductCategoryController {

    private ProductCategoriesService productCategoriesService;

    @Autowired
    public ProductCategoryController(ProductCategoriesService productCategoriesService) {
        this.productCategoriesService = productCategoriesService;
    }


    @GetMapping("/{id}")
    public ProductCategories getProductCategoryById(@PathVariable("id") int productCategory){
        return productCategoriesService.getProductCategoryById(productCategory);
    }

    @GetMapping
    public List<ProductCategories> getAllProductCategory(){
      return productCategoriesService.getAllProductCategory();
    }

    @PutMapping
    public ProductCategories updateProductCategory(@RequestBody ProductCategories productCategories){
        return   productCategoriesService.updateProductCategory(productCategories);
    }
}
