package com.example.myproductservice.service;

import com.example.myproductservice.model.ProductCategories;
import com.example.myproductservice.repository.ProductCategoriesRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoriesService {


    private ProductCategoriesRepository productCategoriesRepository;
    private Faker faker=new Faker();

    @Autowired
    public ProductCategoriesService(ProductCategoriesRepository productCategoriesRepository) {
        this.productCategoriesRepository = productCategoriesRepository;

    }


    public ProductCategories getProductCategoryById(int productCategory){
        return productCategoriesRepository.findById(productCategory).get();
    }

    public List<ProductCategories> getAllProductCategory(){
        return productCategoriesRepository.findAll();
    }

    public ProductCategories updateProductCategory(ProductCategories productCategories){
      return   productCategoriesRepository.save(productCategories);
    }

    public void addProductCategory(){
        List<ProductCategories> list = new ArrayList<>();
        for(int i=1;i<=1000000;i++){
            ProductCategories categories = new ProductCategories();
            categories.setCategoryName("category-"+i);
            list.add(categories);
        }
        productCategoriesRepository.saveAll(list);
    }



    public ProductCategories searchByDescription( String description){
        return productCategoriesRepository.findProductCategoriesByCategoryNameEquals(description);
    }
}
