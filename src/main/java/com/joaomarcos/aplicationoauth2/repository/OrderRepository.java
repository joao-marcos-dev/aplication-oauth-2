package com.joaomarcos.aplicationoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcos.aplicationoauth2.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    
}
