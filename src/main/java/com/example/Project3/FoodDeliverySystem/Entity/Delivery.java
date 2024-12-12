package com.example.Project3.FoodDeliverySystem.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Delivery {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private String id;
	    
	  @Column(nullable = false)
	  private LocalDateTime deliveryDate;
	   
	  @Column(nullable = false)
	  private String deliveryStatus;
	 
	 @OneToOne
	 private OrderDetails order;
	 
	 @ManyToOne
	 private User deliveryPerson;

}
