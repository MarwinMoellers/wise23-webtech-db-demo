package com.example.webtechdbdemos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Zutat {
    @Id
    String id;
    String name;
    Long kalorien;

    String pizzaId;
}
