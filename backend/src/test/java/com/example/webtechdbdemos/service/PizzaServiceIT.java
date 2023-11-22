package com.example.webtechdbdemos.service;

import com.example.webtechdbdemos.model.Pizza;
import com.example.webtechdbdemos.model.PizzaTestMother;
import com.example.webtechdbdemos.respository.PizzaRepository;
import com.example.webtechdbdemos.respository.ZutatRepository;
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

    @Autowired
    ZutatRepository zutatRepository;

    @BeforeEach
    void setUp() {
        pizzaRepository.deleteAll();
        zutatRepository.deleteAll();
    }

    @Test
    void shouldSavePizza() {
        Pizza pizza = PizzaTestMother.complete().build();

        Pizza createdPizza = pizzaService.createPizza(pizza);

        List<Pizza> allPizza = pizzaService.getAllPizza();

        assertThat(allPizza).hasSize(1).contains(createdPizza);
        assertThat(zutatRepository.count()).isEqualTo(1);
    }

    @Test
    void shouldSearchByName() {
        Pizza pizza = PizzaTestMother.complete().name("Maragitha").build();
        Pizza pizza1 = PizzaTestMother.complete().name("Salami").build();

        pizzaService.createPizza(pizza);

        pizzaService.createPizza(pizza1);

        List<Pizza> allPizza = pizzaService.searchByName("alami");

        assertThat(allPizza).hasSize(1).contains(pizza1);
    }
}