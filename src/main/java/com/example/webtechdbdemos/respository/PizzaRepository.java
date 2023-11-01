package com.example.webtechdbdemos.respository;

import com.example.webtechdbdemos.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, String> {
    List<Pizza> findPizzasByNameContaining(String name);
}
