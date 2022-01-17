package com.example.pizaamakerservice.service;

import com.example.pizaamakerservice.model.Product;

import java.util.List;

public interface ProductService {
    Product readByProductType(int productTypeId);

    Product read (int id);

    List<Product> readAll();

    void create (Product product);

    Product update (int id, Product table);

    void delete (int id);

}
