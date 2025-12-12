package com.korea.student.controller;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.student.dto.ResponseDTO;
import com.korea.student.dto.StudentDTO;
import com.korea.student.model.StudentEntity;
import com.korea.student.service.StudentService;

import jakarta.persistence.Entity;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;




@RestController
@RequestMapping("student")
@RequiredArgsConstructor
public class StudentController {
	
	public final StudentService service;
	
	public ResponseEntity<?> eToDTO(List<StudentEntity> entities) {
		
		List<StudentDTO> dtos = entities.stream().map(StudentDTO::new).collect(Collectors.toList());
		
		ResponseDTO<StudentDTO> response = ResponseDTO.<StudentDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<?>  studentCreate(@RequestBody StudentDTO dto){
		StudentEntity entitys = StudentDTO.toEntity(dto);
		List<StudentEntity> entities = service.create(entitys);
		return eToDTO(entities);
		
	}
	
	@GetMapping
	public ResponseEntity<?> studentList(){
		List<StudentEntity> entities = service.list();
		return eToDTO(entities);
	}
	
	
	@PutMapping("/update/{studentid}")
	public ResponseEntity<?> studentUpdate(@PathVariable int studentId, @RequestBody StudentDTO dto){
		StudentEntity entitys = StudentDTO.toEntity(dto);
		List<StudentEntity> entities = service.update(studentId,entitys);
		return eToDTO(entities);
	}
	
	
	

}
