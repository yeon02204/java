package com.korea.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.product.dto.ProductDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
// 서비스 
// Entity 생성/검증/저장/조회
// 데이터를 Repository와 주고받는다.
// 비즈니스 로직 담당.
// Repository를 호출하는 유일한 공간.
@Service
@RequiredArgsConstructor
public class ProductService {

	
	private final ProductRepository repository;

	// 상품 등록 로직을 작성한다.

	public ProductDTO create(ProductEntity entity) {

		// name이 null 또는 빈 문자열이면 예외 발생
		if (entity.getName() == null || entity.getName() == "") {
			throw new RuntimeException("Unknown name");
		}
		// price < 0 예외
		if (entity.getPrice() < 0) {
			throw new RuntimeException("안돼");
		}

		// stock <0 예외
		if (entity.getStock() < 0) {
			throw new RuntimeException("안돼");
		}

		// 검증에 통과하면 Repository를 이용해 저장
		repository.save(entity);

		ProductEntity savedEntity = repository.findById(entity.getId())
				.orElseThrow(() -> new RuntimeException("데이터 없음"));

		ProductDTO dto = new ProductDTO(savedEntity);

		return dto;

	}

}
