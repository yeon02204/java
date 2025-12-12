package com.korea.productApp.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.productApp.dto.ProductDTO;
import com.korea.productApp.dto.ResponseDTO;
import com.korea.productApp.entity.ProductEntity;
import com.korea.productApp.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService service;
	
//	POST /api/products : 상품 등록 (js에서 fetch를 통해 json으로 넘어온다고 가정)
	@PostMapping
	public ResponseEntity<?> productCreate(@RequestBody ProductDTO dto){
		
		ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities = service.add(entity);
		
		List<ProductDTO> dtos = entities.stream().map(ProductDTO::new).collect(Collectors.toList());

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response);
	}
	
	
//	GET /api/products : 전체 조회
	@GetMapping
	public ResponseEntity<?> productList(){
		
		List<ProductEntity> entities = service.findList();
		
		List<ProductDTO> dtos = entities.stream().map(ProductDTO::new).collect(Collectors.toList());

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response);
		
	}
	
	
//	GET /api/products/{id} : 단건 조회
	
	@GetMapping("/{id}")
	public ResponseEntity<?> productFindId(@PathVariable int id){
		
		List<ProductEntity> entities  = service.findProductById(id);
		
		List<ProductDTO> dtos = entities.stream().map(ProductDTO::new).collect(Collectors.toList());

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response);
	}
	
	
//	PUT /api/products/{id} : 수정 (js에서 fetch를 통해 수정하고 싶은 내용을 json으로 넘긴다.)
	
	@PutMapping("/{id}")
	public ResponseEntity<?> productModify(@PathVariable int id, @RequestBody ProductDTO dto){
		
		ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities  = service.modify(id,entity);
		
		List<ProductDTO> dtos = entities.stream().map(ProductDTO::new).collect(Collectors.toList());

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response);
		
		
	}
	
	
//	DELETE /api/products/{id} : 삭제

	@DeleteMapping("/{id}")
	public ResponseEntity<?> productDelet(@PathVariable int id){
		
		List<ProductEntity> entities  = service.delete(id);
		
		List<ProductDTO> dtos = entities.stream().map(ProductDTO::new).collect(Collectors.toList());

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response);
		
	}
	
}
