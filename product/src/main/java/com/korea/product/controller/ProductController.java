package com.korea.product.controller;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.DtoInstantiatingConverter;
import org.springframework.data.mapping.context.PersistentEntities;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.service.ProductService;

import lombok.RequiredArgsConstructor;
// 컨트롤러 
// 요청을 받고 → DTO 만들고 → 서비스에 넘긴다.
// 서비스 결과를 ResponseDTO로 감싸서 반환한다.

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

	// 요청을 DTO로 받는다.
	// 서비스의 createProduct()를 호출한다
	// 결과로 저장된 상품을 DTO로 반환한다.

	private final ProductService service;
	
	// 리스트 엔티티를 디티오로
	private static  ResponseEntity<?> eToDTO(List<ProductEntity> entities){
		
		List<ProductDTO> dtos = entities.stream().map(ProductDTO::new).collect(Collectors.toList());

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response);
	}

	// 조회
	@GetMapping
	public ResponseEntity<?> productList() {

		List<ProductEntity> entities = service.findAll();

		return eToDTO(entities);

	}
	
	
	// 상품추가
	@PostMapping("/createProduct")
	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto){
		
		ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities = service.create(entity);
		
		return eToDTO(entities);
		
	}
	
	// 상품 변경
	@PutMapping("/updateProduct")
	public ResponseEntity<?> updateProduct(@RequestBody ProductDTO dto){
		
		ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities = service.upDate(entity);
		
		return eToDTO(entities);
	}
	
	
	
	// 상품 삭제
	@DeleteMapping("/{productId}")
	public ResponseEntity<?> deleteProduct(@PathVariable int productId){
		
		List<ProductEntity> entities = service.delete(productId);
		
		return eToDTO(entities);
	}
	
	
	
	

}
