package org.example.demointernetstore.service;

import lombok.RequiredArgsConstructor;
import org.example.demointernetstore.model.Basket;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor


public class BasketService {
    private final Basket basket;

    public void addAll(List<Integer> ids) {
        ids.forEach(basket::add);
    }

    public List<Integer> get() {
        return basket.getAll();
    }
}
