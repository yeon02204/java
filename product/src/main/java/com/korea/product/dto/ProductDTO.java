package com.korea.product.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.transform.AliasToEntityMapResultTransformer;

import com.fasterxml.jackson.annotation.JsonFormat;
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

	private int productId;
	private String productName;
	private int productPrice;
	private int productStock;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
    

	// DTO로 변환
    public ProductDTO(ProductEntity entity){
        this.productId = entity.getProductId();
        this.productName = entity.getProductName();
        this.productStock = entity.getProductStock();
        this.productPrice = entity.getProductPrice();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
    }

	// entity로 변환
	public static ProductEntity toEntity(ProductDTO dto) {

		return ProductEntity.builder()
				.productId(dto.getProductId())
				.productName(dto.getProductName())
				.productPrice(dto.getProductPrice())
				.productStock(dto.getProductStock())
				.createdAt(dto.getCreatedAt())
				.updatedAt(dto.getUpdatedAt())
				.build();
	}

}
