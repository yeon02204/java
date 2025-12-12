package com.korea.product.persistence;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.product.model.ProductEntity;

// 레파지토리 
// DB 와 직접 통신
// DB에 실제 접근하는 기능.
// save(), findAll(), findById() 제공.
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{

	// JpaRepository<> 상속
	List<ProductEntity> findByProductId(int productid);
	
}
