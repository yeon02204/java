package com.korea.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="orders")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	@ManyToOne // 다대일 관계 설정
	// 하나의 ProductEntit가 여러개의 OrderEntitiy에 의해 참조될 수 있다 
	@JoinColumn(name="productId", nullable = false)// 외래키로 사용할 컬럼의 정보를 지정
	private ProductEntity product;
	
	private int productCount;
	
	private String orderDate;
}
