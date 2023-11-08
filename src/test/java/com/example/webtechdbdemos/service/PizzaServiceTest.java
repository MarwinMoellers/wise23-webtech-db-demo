package com.example.webtechdbdemos.service;

import com.example.webtechdbdemos.model.Pizza;
import com.example.webtechdbdemos.respository.PizzaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PizzaServiceTest {

    @Mock
    PizzaRepository pizzaRepository;

    @InjectMocks
    PizzaService pizzaService;

    @Test
    void shouldCreatePizza() {
        Pizza pizza = new Pizza();
        pizza.setName("Margaritha");

        Pizza createdPizza = this.pizzaService.createPizza(pizza);

        assertThat(createdPizza.getName()).isEqualTo(pizza.getName());
        assertThat(createdPizza.getId()).isNotNull();
        ArgumentCaptor<Pizza> pizzaArgumentCaptor = ArgumentCaptor.forClass(Pizza.class);
        verify(pizzaRepository).save(pizzaArgumentCaptor.capture());
        Pizza captorValue = pizzaArgumentCaptor.getValue();

        assertThat(captorValue.getId()).isNotNull();

    }
}