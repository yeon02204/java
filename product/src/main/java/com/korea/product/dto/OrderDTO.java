package com.korea.product.dto;

import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.korea.product.model.OrderEntity;
import com.korea.product.model.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDTO {
	private int orderId; // 주문번호
	
	private int productId; // 상품 번호
	
	private String productName; // 상품이름
	
	private int productCount;// 주문 갯수
	
	private int productPrice; // 상품 가격
	
	private int totalPrice; // 결제 금액
	
	private String orderDate; // 주문 날짜
	
	
	public OrderDTO(int orderId, String productName, int productCount, int productPrice, int totalPrice, String orderDate) {
        this.orderId = orderId;
        this.productName = productName;
        this.productCount = productCount;
        this.productPrice = productPrice;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }

	
	// Object[] 데이터를 OrderDTO타입으로 변환
	public static List<OrderDTO> toListOrderDTO(List<Object[]> list){
		return list.stream().map(result -> OrderDTO.builder()
				.orderId((int)result[0])
				.productName((String)result[1])
				.productCount((int)result[2])
				.productPrice((int)result[3])
				.totalPrice((int)result[4])
				.orderDate((String)result[5])
				.build()).collect(Collectors.toList());

	}
	
	
	
}
