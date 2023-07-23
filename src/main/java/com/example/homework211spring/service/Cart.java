package com.example.homework211spring.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class Cart {

    private List<Integer> items = new ArrayList<>();

    public List<Integer> addItems(List<Integer> items) {
        this.items.addAll(items);
        return getItems();
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}
