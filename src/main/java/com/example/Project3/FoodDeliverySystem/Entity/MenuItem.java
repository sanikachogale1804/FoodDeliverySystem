package com.example.Project3.FoodDeliverySystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MenuItem {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	    
	 @Column(nullable = false)
	 private String name;
	  
	 @Column(nullable = false)
	 private Double price;
	    
	 @Column(nullable = false)
	 private String description;
	 
	 @ManyToOne
	 private Restaurant restaurant;

}
