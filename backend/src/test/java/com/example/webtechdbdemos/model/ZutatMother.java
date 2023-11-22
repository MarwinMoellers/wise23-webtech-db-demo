package com.example.webtechdbdemos.model;

import static org.junit.jupiter.api.Assertions.*;

public class ZutatMother {
    public static Zutat.ZutatBuilder complete() {
        return Zutat.builder().name("Tomatensoße").kalorien(3L);
    }
}