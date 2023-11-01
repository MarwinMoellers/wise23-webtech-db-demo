package com.example.webtechdbdemos.service;

import com.example.webtechdbdemos.model.Pizza;
import com.example.webtechdbdemos.respository.PizzaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    public Pizza createPizza(Pizza pizza) {
        pizza.setId(UUID.randomUUID().toString());
        pizzaRepository.save(pizza);
        return pizza;
    }
}
