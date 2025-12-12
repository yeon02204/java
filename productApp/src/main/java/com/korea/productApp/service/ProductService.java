package com.korea.productApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.productApp.entity.ProductEntity;
import com.korea.productApp.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository repository;

//	추가 addProduct
//	- 저장 후 전체 조회후 반환

	public List<ProductEntity> add(ProductEntity entity) {
		repository.save(entity);
		return repository.findAll();
	}

//	전체 조회 findProduct
//	- 리스트 반환

	public List<ProductEntity> findList() {

		return repository.findAll();
	}

//	id를 통해서 한건 조회 findProductById
//	- 없으면 예외 발생시키기(또는 Optional 처리) throw new RuntimeException(메시지) 사용

	public List<ProductEntity> findProductById(int id) {

		ProductEntity entity = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("아이디를 찾을 수 없습니다."));
		
		return List.of(entity);

	}

//	수정하기 modifyProduct
//	- findById()를 통해 한건을 꺼내온다.
//	- 데이터 있으면 name/price/stock 수정, 
//	없으면 예외 발생시키기 throw new RuntimeException(메시지) 사용

	public List<ProductEntity> modify(int id, ProductEntity newData) {

		ProductEntity entity = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("아이디를 찾을 수 없습니다."));

		entity.setName(newData.getName());
		entity.setPrice(newData.getPrice());
		entity.setStock(newData.getStock());

		repository.save(entity);

		return repository.findAll();
	}

//	삭제하기 deletProduct
//	- findById()를 통해 한 건을 찾아온다.
//	- 있으면 삭제하기
//	- 없으면 예외 발생시키기 throw new RuntimeException(메시지) 사용

	public List<ProductEntity> delete(int id) {

		repository.findById(id)
		.orElseThrow(() -> new RuntimeException("아이디를 찾을 수 없습니다."));

		repository.deleteById(id);

		return repository.findAll();
	}

}
