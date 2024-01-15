package com.simple.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.springapp.model.Product;
import com.simple.springapp.service.ProductService;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProductController {
    
    @Autowired
    ProductService productService;

    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("add-products")
    public String postAllProducts(@RequestBody List<Product> productsList){
        return productService.postAllProducts(productsList);
    }
}
