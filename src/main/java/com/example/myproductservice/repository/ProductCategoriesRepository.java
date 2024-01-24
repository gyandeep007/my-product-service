package com.example.myproductservice.repository;

import com.example.myproductservice.model.ProductCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoriesRepository extends JpaRepository<ProductCategories,Integer> {
    ProductCategories findProductCategoriesByCategoryNameEquals(String name);
    List<ProductCategories> findProductCategoriesByCategoryIdGreaterThanEqual(int id);

}
