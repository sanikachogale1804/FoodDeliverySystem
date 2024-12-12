package com.example.Project3.FoodDeliverySystem.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurant {

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private String id;
	  
	 @Column(nullable = false)
	 private String name;
	   
	 @Column(nullable = false)
	 private String address;
	    
	 @Column(nullable = false)
	 private String phoneNumber;
	 
	 @OneToMany(mappedBy = "restaurant")
	 private List<MenuItem> menuitems;
	 
	 @OneToMany(mappedBy = "restaurant")
	 private List<OrderDetails> orders;
	 
}
