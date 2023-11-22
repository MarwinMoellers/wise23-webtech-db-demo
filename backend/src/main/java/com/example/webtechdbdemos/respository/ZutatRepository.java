package com.example.webtechdbdemos.respository;

import com.example.webtechdbdemos.model.Pizza;
import com.example.webtechdbdemos.model.Zutat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZutatRepository extends JpaRepository<Zutat, String> {
}
