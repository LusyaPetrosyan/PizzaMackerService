package com.example.pizaamakerservice.service;

import com.example.pizaamakerservice.model.ProductType;

import javax.persistence.Table;
import java.util.List;

public interface ProductTypeService {
    ProductType read (int id);

    List <ProductType> readAll();

    void create (ProductType productType);

    ProductType update (int id, ProductType table);

    void delete (int id);
}
