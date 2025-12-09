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

	public UserEntity create(UserEntity entity) {
		return repository.save(entity);

	}

	public List<UserEntity> getAllUsers() {
		return repository.findAll();
	}

	public UserEntity getUserByEmail(String eamil) {

		return repository.findByEmail(eamil);
	}

}
