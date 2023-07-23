package com.example.homework211spring.controller;

import com.example.homework211spring.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> items) {
        return orderService.addAll(items);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getAll();
    }
}
