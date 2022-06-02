package com.example.apishop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ShopService {

    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    public Product getProductByID(String id){
        return productRepo.getProductFromMap(id);
    }
    public List<Product> listAllProducts(){
       return productRepo.listProducts();
    }
    public Order getOrderByID(String id){
        return orderRepo.getOrder(id);
    }
    public List<Order> list(){
        return orderRepo.listOrders();
    }
    public void add(Order order){
        orderRepo.addOrder(order);
    }

}
