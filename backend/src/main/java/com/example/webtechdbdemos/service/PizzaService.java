package com.example.webtechdbdemos.service;

import com.example.webtechdbdemos.model.Pizza;
import com.example.webtechdbdemos.respository.PizzaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final ZutatService zutatService;

    public Pizza createPizza(Pizza pizza) {
        pizza.setZutaten(pizza.getZutaten().stream().map(zutatService::createZutat).toList());
        pizza.setId(UUID.randomUUID().toString());
        pizzaRepository.save(pizza);
        return pizza;
    }

    public List<Pizza> getAllPizza() {

        return pizzaRepository.findAll();
    }

    public List<Pizza> searchByName(String name) {
        return pizzaRepository.findPizzasByNameContaining(name);
    }
}
