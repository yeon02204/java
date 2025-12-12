package com.korea.product.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	// (strategy = GenerationType.AUTO) : 내부적으로 어떤 생성 전략이 선택되는지는 JPA 구현체 (Hibrnate)의 설정과
	// 사용중인 데이터베이스 종류에 따라 달라진다 -> 사요중인 데이터 베이스가 자동 증가(Auto-Increment)를 지원는지 확인
	private int productId; 
	private String productName;
	private int productPrice;
	private int productStock;
	@CreationTimestamp // Insert 쿼리가 발생했을때 현 시간 값을 적용시켜준다
	private LocalDateTime createdAt;
	@UpdateTimestamp // Update 쿼리가 발생했을때 현재 시간 값을 적용시켜준다.
	//값이 없으면 CreationTimestamp같이 생성시점이 한번 기록될 수 있다
	private LocalDateTime updatedAt;
}
