package com.example.webtechdbdemos.service;

import com.example.webtechdbdemos.model.Pizza;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PizzaService {
    public Pizza createPizza(Pizza pizza) {
        pizza.setId(UUID.randomUUID().toString());
        return pizza;
    }
}
