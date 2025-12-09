package com.korea.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;

import com.korea.product.service.ProductService;

import lombok.RequiredArgsConstructor;

// 컨트롤러 
// 요청을 받고 → DTO 만들고 → 서비스에 넘긴다.
// 서비스 결과를 ResponseDTO로 감싸서 반환한다.
@RestController
// @RequestMapping("Product")
@RequiredArgsConstructor
public class ProductController {
	
	// 요청을 DTO로 받는다.
	// 서비스의 createProduct()를 호출한다
	// 결과로 저장된 상품을 DTO로 반환한다.
	
	private final ProductService service;
	
	@PostMapping("/createProduct")
	public ProductDTO createProduct(@RequestBody ProductDTO dto){
		ProductDTO dtos = service.create(ProductDTO.ToEntity(dto));
		return dtos;
		
		
	}

}
