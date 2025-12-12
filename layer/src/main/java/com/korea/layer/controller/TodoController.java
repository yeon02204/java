package com.korea.layer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.h2.command.ddl.AlterDomainRename;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.layer.dto.ResponseDTO;
import com.korea.layer.dto.TodoDTO;
import com.korea.layer.model.TodoEntity;
import com.korea.layer.service.TodoService;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
@CrossOrigin(originPatterns = "*",allowCredentials = "false")
public class TodoController {
	// 해야할일 api를 만들것이다

	@Autowired // 필드주입
	// 스프링 컨테이너가 실행될때 Todoservice타입의 빈을 찾아소 service 필두에 넣어준다
	private final TodoService service;// null

	// 생성자 주입
//	public TodoController(TodoService service) {
//		this.service = service;
//	}

	// setter 주입
	// setter를 통해 주입하는 방식이다
//	public void setService(TodoService service) {
//		this.service=service;
//	}

	// localhost:8080/todo/test
	@GetMapping("/test")
	public ResponseEntity<?> testTodo() {
		String str = service.testService();// testService() 메서드를 실행해고 결과를 받아온다
		List<String> list = new ArrayList<String>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();

		return ResponseEntity.ok().body(response);
	}

	@PostMapping("/createTodo")
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto) {

		try {
			// 로그인 기능이 없기 때문에 임시유저
			String tempraryUserId = "Temporaray-uesr";
			// DTO -> Entity
			TodoEntity entity = TodoDTO.ToEntity(dto);

			// 엔티티가 새로운 데이터임을 보장
			entity.setId(null);

			// 엔티티에 임시 유저 아이디 세팅
			entity.setUserId(tempraryUserId);

			// 서비스 레이어의 create 메서드를 호출해서 TodoEntity를 데이터베이스에 저장하는 작업을 한다
			// 저장을 한다음 TodoEntity 객체들을 저장한 list를 반환한다

			List<TodoEntity> entites = service.create(entity);

//			List<TodoDTO> dtos = new ArrayList<>();
//
//			
//
//			for (TodoEntity e : entites) {
//				dtos.add(new TodoDTO(e));
//			}
			// 리스트 안에 들어있는 TodoEntity를 TodoDTO 타입으로 변경해서 dtos에 넣는다
			List<TodoDTO> dtos = entites.stream()
					.map(TodoDTO::new)
					.collect(Collectors.toList());
			
			
			

			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();

			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			String errorString = e.getMessage();

			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(e.getMessage()).build();
			return ResponseEntity.ok().body(response);

		}
	}

	// 생성된 모든 할일을 조회하는 retrieveTodoList
	// 어떤 한 유저가 만든 할 일에 대해서 조회
	// 임시 유저 : tmporary-user
	// @Getmapping

	@GetMapping
	public ResponseEntity<?> retrieveTodoList() {
		String tempraryUserId = "Temporaray-uesr";
		List<TodoEntity> user = service.retrieve(tempraryUserId);

		List<TodoDTO> dtos = new ArrayList<>();

		for (TodoEntity e : user) {
			dtos.add(new TodoDTO(e));
		}

		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();

		return ResponseEntity.ok().body(response);

	}

	// 할일을 수정하기 위한 updateTodo 메서드 만들기
	// 수정할려는 내용을 사용자로부터 받아서 처리
	// 임시유저 넣기

//	@PutMapping
//	public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto){
//		String tempraryUserId = "Temporaray-uesr";
//		
//		TodoEntity userentity = TodoDTO.ToEntity(dto);
//		
//		userentity.setUserId(tempraryUserId);
//		
//		TodoEntity entitys = TodoDTO.ToEntity(dto);
//		
//		List<TodoEntity> user = service.update(entitys);
//		
//		
//		List<TodoDTO> dtos = new ArrayList<>();
//		
//		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder()
//		        .data(dtos)
//		        .build();
//		
//		return ResponseEntity.ok().body(response);
//	}

	@PutMapping
	public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto) {
		String tempraryUserId = "Temporaray-uesr";

		TodoEntity entity = TodoDTO.ToEntity(dto);

		 entity.setUserId(tempraryUserId);

		List<TodoEntity> entities = service.update(entity);

		List<TodoDTO> dtos = new ArrayList<>();

		for (TodoEntity e : entities) {
			dtos.add(new TodoDTO(e));
		}

		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();

		return ResponseEntity.ok().body(response);

	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTodo(@PathVariable String id){
		
		String tempraryUserId = "Temporaray-uesr";
		
		TodoEntity entity = TodoEntity.builder().id(id).userId(tempraryUserId).build();

		// entity.setUserId(tempraryUserId);
		
		List<TodoEntity> entities = service.delete(entity);
		
		List<TodoDTO> dtos = entities.stream()
				.map(TodoDTO::new)
				.collect(Collectors.toList());

		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();

		return ResponseEntity.ok().body(response);
		
	}
	
	
	
	
	
	
	
	
	

}
