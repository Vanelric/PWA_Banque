/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parttwo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA Repository of Order.
 */
public interface OrderRepo  extends JpaRepository<Order, Integer>  {
    
}
