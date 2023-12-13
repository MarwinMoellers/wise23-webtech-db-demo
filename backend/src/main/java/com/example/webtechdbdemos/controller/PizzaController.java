package com.example.webtechdbdemos.controller;

import com.example.webtechdbdemos.model.Pizza;
import com.example.webtechdbdemos.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pizza")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PizzaController {

    private final PizzaService pizzaService;

    @PostMapping
    public Pizza createPizza(@RequestBody Pizza pizza) {
        return pizzaService.createPizza(pizza);
    }

    @GetMapping
    public List<Pizza> findAll(@RequestParam(required = false) String name) {
        if (name != null) {
            return pizzaService.searchByName(name);
        }
        return pizzaService.getAllPizza();
    }
}
