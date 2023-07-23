package com.example.homework211spring.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addAll(List<Integer> idList) {
        return cart.addItems(idList);
    }

    @Override
    public List<Integer> getAll() {
        return cart.getItems();
    }
}
