package com.example.products.controller;


import com.example.products.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/products")
public class ProductRestController {

    @GetMapping()
    public Product getProduct(@RequestParam String id) {
        return new Product(id,"Notebook",2000.0,"1");
    }
}
