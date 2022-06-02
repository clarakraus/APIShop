package com.example.apishop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository

public class ProductRepo {

    private HashMap<String,  Product> productRepo = new HashMap<>();

    public List<Product> listProducts(){
        return productRepo.values()
                .stream()
                .toList();

    }
    public Product getProductFromMap(String id){
        return productRepo.get(id);

    }
}
