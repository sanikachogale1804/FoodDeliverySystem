package com.example.Project3.FoodDeliverySystem.Entity;

import java.util.List;

import org.springframework.context.annotation.Fallback;

import jakarta.persistence.CascadeType;
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
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private String id;
	    
	 @Column(nullable = false)
	 private String name;
	    
	 @Column(nullable = false)
	 private String email;
	    
	 @Column(nullable = false)
	 private String password; 
	    
	 @Column(nullable = false)
	 private String role; 
	   
	 @Column(nullable = false)
	 private String phoneNumber;
	 
     @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	 private List<OrderDetails> orders;
     
     @OneToMany(mappedBy = "deliveryPerson")
     private List<Delivery> deliveries;
	 
}
