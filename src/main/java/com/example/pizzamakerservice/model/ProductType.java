package com.example.pizzamakerservice.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class ProductType {
    private int id;
    private String name;
    private String image_path;
}
