package com.example.Project3.FoodDeliverySystem.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderDetails {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	    
	 @Column(nullable = false)
	 @CreationTimestamp
	 private LocalDateTime orderDate;
	
	 @Column(nullable = false)
	 private Double totalAmount;

	 @ManyToOne
	 private User user;
	 
	 @ManyToOne
	 private Restaurant restaurant;
	 
	 @ManyToMany
	 private List<MenuItem> menuItems;
	 
	 @ManyToOne
	 private Delivery delivery;
}
