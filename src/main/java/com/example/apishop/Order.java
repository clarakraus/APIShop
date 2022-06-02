package com.example.apishop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    private String orderName;
    private final String orderID = UUID.randomUUID().toString();


}
