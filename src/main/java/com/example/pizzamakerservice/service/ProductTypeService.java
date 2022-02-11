package com.example.pizzamakerservice.service;

import com.example.pizzamakerservice.model.ProductType;

import java.util.List;

public interface ProductTypeService {
    ProductType read(int id);

    List<ProductType> readAll();

    void create(ProductType productType);

    ProductType update(int id, ProductType table);

    void delete(int id);

    ProductType read(String name);
}
