package com.mab.simpleWebApp.service;

import com.mab.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(1,"iPhone",1400),
            new Product(2,"TV",700),
            new Product(3,"Mouse",26),
            new Product(4,"Tablette",390)
    );

    public List<Product> getProducts(){
        return products;
    }

}
