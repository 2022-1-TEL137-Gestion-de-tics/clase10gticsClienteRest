package com.example.clase10gticsconsumorest.dao;

import com.example.clase10gticsconsumorest.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryDao {

    public List<Category> listarCategorias() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Category[]> response = restTemplate.getForEntity(
                "http://localhost:8080/category", Category[].class);

        return Arrays.asList(response.getBody());
    }
}

