package com.QA.repo;

import com.QA.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepo extends JpaRepository<Order,Integer> {


    void saveOrder();
}
