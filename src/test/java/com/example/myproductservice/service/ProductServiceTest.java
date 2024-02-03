package com.example.myproductservice.service;

import com.example.myproductservice.model.Product;
import com.example.myproductservice.repository.ProductRepository;
import com.example.myproductservice.utility.DataUtility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void generateFile() throws IOException, JSONException {
        DataUtility.convertToElastic("sample-product.json");
    }

}
