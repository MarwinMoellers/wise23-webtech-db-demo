package com.example.webtechdbdemos.model;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTestMother {
    public static Pizza.PizzaBuilder complete() {
        Pizza.PizzaBuilder pizza = Pizza.builder();
        pizza.name("Salami");
        return pizza;
    }
}