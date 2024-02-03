package com.example.myproductservice.repository;

import com.example.myproductservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductCustomRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void saveProducts(List<Product> productList){
         String insertQuery = "insert into product(product_id,name,description,unit,price)values(?,?,?,?,?)";
         String updateQuery = "update product set name=?,description=?,unit=?,price=? where product_id=?";

        int[] updatedRecord=   jdbcTemplate.batchUpdate(updateQuery, new BatchPreparedStatementSetter() {
             @Override
             public void setValues(PreparedStatement ps, int i) throws SQLException {
                 Product product = productList.get(i);
                 ps.setString(1,product.getName());
                 ps.setString(2,product.getDescription());
                 ps.setString(3,product.getUnit());
                 ps.setInt(4,product.getPrice());
                 ps.setString(5,product.getProductId());
             }

             @Override
             public int getBatchSize() {
                 return productList.size();
             }
         });
      int[] insertedRecord =  jdbcTemplate.batchUpdate(insertQuery, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Product product = productList.get(i);
                ps.setString(1,product.getProductId());
                ps.setString(2,product.getName());
                ps.setString(3,product.getDescription());
                ps.setString(4,product.getUnit());
                ps.setInt(5,product.getPrice());
            }

            @Override
            public int getBatchSize() {
                return productList.size();
            }
        });

        System.out.println("bulk insertion and updating completed "+productList.size());

    }
}
