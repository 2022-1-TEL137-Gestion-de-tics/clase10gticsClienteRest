package com.example.clase10gticsconsumorest.dto;

import com.example.clase10gticsconsumorest.entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String result;
    private String msg;
    private Product product;
}
