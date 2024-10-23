package com.mab.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private int prodId;
    private String prodName;
    private int price;
}
