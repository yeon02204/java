package com.korea.user.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.user.model.UserEntity;

@Repository
public abstract interface UserRepository extends JpaRepository<UserEntity, Integer>{

	// 이메일을 통해 유저를 찾는 findByEmail추상메서드 추가하기
	// (반환 타입은 UserEntity)
	
	public abstract UserEntity findByEmail(String email);
}
