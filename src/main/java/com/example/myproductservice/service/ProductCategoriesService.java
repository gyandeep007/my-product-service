package com.example.myproductservice.service;

import com.example.myproductservice.model.ProductCategories;
import com.example.myproductservice.repository.ProductCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoriesService {


    private ProductCategoriesRepository productCategoriesRepository;

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
}
