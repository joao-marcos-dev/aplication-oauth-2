package com.joaomarcos.aplicationoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcos.aplicationoauth2.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    
}
