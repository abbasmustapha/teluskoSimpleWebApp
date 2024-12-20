package com.mab.simpleWebApp.service;

import com.mab.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(100,"iPhone",1400),
            new Product(120,"TV",700),
            new Product(130,"Mouse",26),
            new Product(140,"Tablette",390)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(999,"Pas trouvé",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

}
