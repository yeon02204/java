package com.korea.product.dto;

import java.util.List;

import org.hibernate.transform.AliasToEntityMapResultTransformer;

import com.korea.product.model.ProductEntity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 프론트에서 주고받는 데이터 형태.
// Entity를 감추는 보호막.

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {

	private String id;
	private String name;
	private int price;
	private int stock;
	private String description;

	// DTO로 변환
	public ProductDTO(ProductEntity entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.stock = entity.getStock();
		this.description = entity.getDescription();
	}

	// entity로 변환
	public static ProductEntity ToEntity(ProductDTO dto) {

		return ProductEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.price(dto.getPrice())
				.stock(dto.getStock())
				.description(dto.getDescription())
				.build();
	}

}
