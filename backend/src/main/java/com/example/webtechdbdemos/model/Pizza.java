package com.example.webtechdbdemos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    @Id
    String id;
    String name;

    @ManyToMany
    List<Zutat> zutaten;

}
