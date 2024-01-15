package com.simple.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.springapp.dao.ProductDao;
import com.simple.springapp.model.Product;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;
    
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public String postAllProducts(List<Product> productsList) {
        productDao.saveAll(productsList);
        return "Request Processed...";
    }
    
}
