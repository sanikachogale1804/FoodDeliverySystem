package com.example.Project3.FoodDeliverySystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project3.FoodDeliverySystem.Entity.OrderDetails;

public interface OrderRepository extends JpaRepository<OrderDetails, String>{

}
