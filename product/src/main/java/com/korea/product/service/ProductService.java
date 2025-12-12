package com.korea.product.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
	
	

	// 조회
	public List<ProductEntity> findAll() {
		return repository.findAll();
		
	}
	
	// 추가
	public List<ProductEntity> create(ProductEntity entity){
		
		repository.save(entity);
		return findAll();
	}
	// 수정
		public List<ProductEntity> upDate(ProductEntity entity){
			repository.save(entity); 
			return findAll();
		}
	
	// 삭제
	public List<ProductEntity> delete(int productId){
		repository.deleteById(productId);
		return findAll();
	}
	
	

}
