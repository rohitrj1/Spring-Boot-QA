package com.QA.services;

import com.QA.repo.OrderRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

//    @Autowired
    private OrderRepo orderRepo;

    // constructor injection
//    @Autowired
//    public OrderService(OrderRepo orderRepo) {
//        this.orderRepo = orderRepo;
//    }
// setter injection
    @Autowired
    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void test(){
        orderRepo.saveOrder();
    }

    @PostConstruct
public void checkPostCond(){
    System.out.println("Post construct service method.....!");
}

}
