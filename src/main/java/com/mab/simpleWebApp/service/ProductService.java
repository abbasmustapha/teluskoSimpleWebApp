package com.mab.simpleWebApp.service;

import com.mab.simpleWebApp.model.Product;
import com.mab.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo ;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(100,"iPhone",1400),
//            new Product(120,"TV",700),
//            new Product(130,"Mouse",26),
//            new Product(140,"Tablette",390)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        System.out.println("Service addProduct : " + prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
