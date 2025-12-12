package com.korea.layer.service;


import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.aspectj.weaver.patterns.IfPointcut;
import org.h2.command.ddl.CreateAggregate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.DtoInstantiatingConverter;
import org.springframework.stereotype.Service;

import com.korea.layer.Persistence.TodoRepository;
import com.korea.layer.dto.TodoDTO;
import com.korea.layer.model.TodoEntity;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression;

@Slf4j // (Simple Logging Facade for java) 로그를 작성하는 표준 인터페이스
@Service
// 스프링 프레임 워크에서 제공하는 어노테이션중 하나로 서비스 레이어에
// 사용되는 클래스를 명시할때 사용
// 이 어노테이션을 사용하면 스프링부트가 해당 클래스를 스프링 컨테이너에서 
// 관리하는 빈(bean)으로 등록하고, 비즈니스 로직을 처리하는 역할을 맡는다.
@RequiredArgsConstructor
public class TodoService {

	// 생성자 주입받기
	private final TodoRepository repository;

//	public TodoService(TodoRepository repository) {
//		this.repository = repository;
//	}

	public String testService() {
		// build 패턴으로 TodoEntity 객체를 하나 만든다
		// title : My First Todo item
		TodoEntity entity = TodoEntity.builder().title("My First Todo item").build();
		// TodoEntity를 db에 저장하기
		repository.save(entity);

		// 저장된 데이터 찾기
		// findById의 반환형 Optional
		// Optional "null"이 들어올 수 있는 값을 안전하게 감싸는 박스
		// 값이 없으면 예외발생, 값이 있으면 정상 반환
		TodoEntity savedEntity = repository.findById(entity.getId()).orElseThrow(() -> new RuntimeException("데이터 없음"));
		return savedEntity.getTitle();

		// Optional<TodoEntity> optional = repository.findById(entity.getId());

		// TodoEntity savedEntity = null;
		// isPresent() : 반환된 optional 객체 안에 값이 존재하면 true, 없으면 false
//		if (optional.isPresent()) {
//			savedEntity = optional.get();
//
//			return savedEntity.getTitle();
//		}
	}

	
	// 추가
	public List<TodoEntity> create(TodoEntity entity) {

		// 매개변수로 넘어온 entity가 유효한지 확인한다
		validate(entity);

		// 1. db에 저장한다
		repository.save(entity);

		// 2. 해당 유저가 추가한 todo item을 모두 조회하여 반환
		// findByUserId()를 사용할 것
		return repository.findByUserId(entity.getUserId());
	}
	
	
	
	
	// 조회

	// DB에서 모든 데이터를 꺼내서 반환하는 retrieve 메서드 작성하기
	// findByUserId() 메서드 활용하기
	public List<TodoEntity> retrieve(String id) {
		return repository.findByUserId(id);

	}
	
	

//	public List<TodoEntity> update(TodoEntity entity) {
//
//		Optional<TodoEntity> optional = repository.findById(entity.getId());
//
//		if (optional.isPresent()) {
//
//			optional.get().setTitle(entity.getTitle());
//	        optional.get().setDone(entity.isDone());
//
//	        repository.save(optional.get());
//
//		}
//
//		return repository.findByUserId(entity.getUserId());
//
//	}
	
	
	// 수정

	public List<TodoEntity> update(TodoEntity entity) {

		validate(entity);

		// 넘겨받은 entity의 id를 이용해 TodoEntity한 건을 db로 부터 가져온다
		// 존재하지 않는 엔티티는 업데이트 할 수 없기 때문에

		Optional<TodoEntity> original = repository.findById(entity.getId());

		if (original.isPresent()) {

			// 오리지날의 내용을 가져와서 사용자가 전달한 제목과 boolean값으로 다시 세팅

			TodoEntity todo = original.get();

			todo.setTitle(entity.getTitle());
			todo.setDone(entity.isDone());

			repository.save(todo);

		}
		return repository.findByUserId(entity.getUserId());

	}
	
	// 유효성 검사

	private void validate(TodoEntity entity) {
		// 1. 매개변수로 넘어온 Entity가 유효(null인지 아닌지)한지 검사한다
		// null이면 RuntimeException("Entity cannot be null")
		if (entity == null) {
			throw new RuntimeException("Entity cannot be null");
		}

		// 1-1. userId가 null이면 RunTimeException("Unknown User")에러 발생

		if (entity.getUserId() == null) {
			throw new RuntimeException("Unknown User");
		}
	}
	
	// 삭제

	public List<TodoEntity> delete(TodoEntity entity) {
		
		TodoEntity entitys = repository.findById(entity.getId())
		        .orElseThrow(() -> new RuntimeException("Todo not found"));

		    String userId = entity.getUserId();

		    
		    repository.deleteById(entity.getId());

		    return retrieve(userId);
	}

}
