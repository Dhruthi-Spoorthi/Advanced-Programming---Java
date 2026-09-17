package com.jewellery.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/shop")
    public String shop() {
        return "shop";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }

    @GetMapping("/order-confirmation")
    public String orderConfirmation() {
        return "order-confirmation";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/admin/products")
    public String adminProducts() {
        return "admin-products";
    }

    @GetMapping("/admin/categories")
    public String adminCategories() {
        return "admin-categories";
    }

    @GetMapping("/admin/orders")
    public String adminOrders() {
        return "admin-orders";
    }

    @GetMapping("/product/{id}")
    public String productDetails() {
        return "product-details";
    }
}