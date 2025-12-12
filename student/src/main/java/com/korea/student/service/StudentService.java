package com.korea.student.service;

import java.util.List;

import org.hibernate.bytecode.internal.bytebuddy.BytecodeProviderImpl.GetPropertyNames;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.korea.student.dto.StudentDTO;
import com.korea.student.model.StudentEntity;
import com.korea.student.persistence.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
	
	public static StudentRepository repository;

	public List<StudentEntity> create(StudentEntity entity) {
		
		 repository.save(entity);
		 
		 return repository.findAll();
	}
	
	public List<StudentEntity> list(){
		return repository.findAll();
	}

	public List<StudentEntity> update(int studentId, StudentEntity entity) {
		
		StudentEntity entityty = repository.findByStudntId(studentId)
				.orElseThrow(()-> new RuntimeException("아이디를 찾을 수 없습니다"));
		
		entityty.setName(entity.getName());
		repository.save(entity);
		
		return list();
		
	}

}
