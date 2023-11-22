package com.example.webtechdbdemos.service;

import com.example.webtechdbdemos.model.Zutat;
import com.example.webtechdbdemos.respository.ZutatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ZutatService {

    @Autowired
    ZutatRepository zutatRepository;

    Zutat createZutat(Zutat zutat) {
        zutat.setId(UUID.randomUUID().toString());
        return zutatRepository.save(zutat);
    }
}
