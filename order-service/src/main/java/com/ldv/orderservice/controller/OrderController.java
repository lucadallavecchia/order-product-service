package com.ldv.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/order-service/v1/orders")
public class OrderController {


    @GetMapping
    public void getAllOrders() {

    }

    @GetMapping(path = "/{orderId}")
    public void getOrderById(@PathVariable Long orderId) {

    }

}
