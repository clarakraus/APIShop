package com.example.apishop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    private ArrayList<Product> products;
    private final String orderID = UUID.randomUUID().toString();


}
