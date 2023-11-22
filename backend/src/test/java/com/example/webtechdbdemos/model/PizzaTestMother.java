package com.example.webtechdbdemos.model;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTestMother {
    public static Pizza.PizzaBuilder complete() {
        Pizza.PizzaBuilder pizza = Pizza.builder();
        pizza.zutaten(List.of(ZutatMother.complete().build()));
        pizza.name("Salami");
        return pizza;
    }
}