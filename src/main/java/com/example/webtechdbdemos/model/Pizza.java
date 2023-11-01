package com.example.webtechdbdemos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pizza {
    @Id
    String id;
    String name;

}
