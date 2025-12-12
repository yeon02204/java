package com.korea.productApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Entity
@Table(name = "product")

public class ProductEntity {
	
	@Id
	@GeneratedValue // 자동증가
	private int id; 
	private String name; // not null
	private int price;
	private int stock;
	
}
