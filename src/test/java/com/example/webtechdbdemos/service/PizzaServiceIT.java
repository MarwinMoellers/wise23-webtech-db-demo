package com.example.webtechdbdemos.service;

import com.example.webtechdbdemos.model.Pizza;
import com.example.webtechdbdemos.model.PizzaTestMother;
import com.example.webtechdbdemos.respository.PizzaRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PizzaServiceIT {
    @Autowired
    PizzaService pizzaService;

    @Autowired
    PizzaRepository pizzaRepository;

    @BeforeEach
    void setUp() {
        pizzaRepository.deleteAll();
    }

    @Test
    void shouldSavePizza() {
        Pizza pizza = new Pizza();
        pizza.setName("Maragritha");

        Pizza createdPizza = pizzaService.createPizza(pizza);

        List<Pizza> allPizza = pizzaService.getAllPizza();

        assertThat(allPizza).hasSize(1).contains(createdPizza);
    }

    @Test
    void shouldSavePizza1() {
        Pizza pizza = PizzaTestMother.complete().build();

        Pizza createdPizza = pizzaService.createPizza(pizza);

        List<Pizza> allPizza = pizzaService.getAllPizza();

        assertThat(allPizza).hasSize(1).contains(createdPizza);
    }
}