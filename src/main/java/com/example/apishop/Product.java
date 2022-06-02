package com.example.apishop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private String productName;
    private final String productID = UUID.randomUUID().toString();
}
