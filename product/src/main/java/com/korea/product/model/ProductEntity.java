package com.korea.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
// 엔티티 
// DB 테이블과 연결된 클래스.
// 실제 저장되는 형태.
@Entity
@Table(name="Product")
public class ProductEntity {

	@Id // 기본키
	@GeneratedValue(strategy =  GenerationType.UUID)
	private String id; //pk, 자동증가
	private String name;
	private int price;
	private int stock;
	private String description;
}
