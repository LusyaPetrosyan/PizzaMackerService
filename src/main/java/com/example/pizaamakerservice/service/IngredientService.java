package com.example.pizaamakerservice.service;

import com.example.pizaamakerservice.model.Ingredient;

import java.util.List;

public interface IngredientService {
    Ingredient read (int id);

    List<Ingredient> readAll();

    void create (Ingredient table);

    Ingredient update (int id, Ingredient table);
    
    void delete (int id);
}
