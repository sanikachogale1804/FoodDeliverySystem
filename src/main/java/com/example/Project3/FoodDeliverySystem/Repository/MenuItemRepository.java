package com.example.Project3.FoodDeliverySystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project3.FoodDeliverySystem.Entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer>{

}
