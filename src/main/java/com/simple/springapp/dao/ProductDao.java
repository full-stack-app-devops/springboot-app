package com.simple.springapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simple.springapp.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
}