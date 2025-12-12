package com.korea.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.user.model.UserEntity;
import com.korea.user.persistence.UserRepository;

import lombok.RequiredArgsConstructor;

@Service

@RequiredArgsConstructor
public class UserService {

	private final UserRepository repository;

	// 생성
	public UserEntity create(UserEntity entity) {
		return repository.save(entity);

	}

	// 조회
	public List<UserEntity> getAllUsers() {
		return repository.findAll();
	}

	// 이메일로 찾기
	public UserEntity getUserByEmail(String email) {
		return repository.findByEmail(email);
		
	}
	
	// 삭제
//	public UserEntity deleteUser(int id) {
//		if(id == 0) {
//			return 0;
//		}
//		
//		return repository.deleteById(id);
//	}
	
	
	// 수정

}
