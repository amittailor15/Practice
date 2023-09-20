package com.coforge.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private int prid;
	private String prname;
	private float prcost;
	private LocalDate prdate;
	
	@OneToMany(cascade = CascadeType.ALL)
	 private Set<Order1> orderSet1;
}
