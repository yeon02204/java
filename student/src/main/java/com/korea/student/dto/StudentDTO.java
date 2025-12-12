package com.korea.student.dto;

import com.korea.student.model.StudentEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

	private int  studentId;
	private String name;
	private int age;
	private String major;
	private String createdAt;
	private String updatedAt;
	
	public StudentDTO(StudentEntity entity) {
		this.studentId =entity.getStudentId();
		this.name = entity.getName();
		this.age = entity.getAge();
		this.major = entity.getMajor();
		this.createdAt = entity.getCreatedAt();
		this.updatedAt = entity.getUpdatedAt();
	}
	
	public static StudentEntity toEntity(StudentDTO dto) {
		return StudentEntity.builder()
				.studentId(dto.getStudentId())
				.name(dto.getName())
				.age(dto.getAge())
				.major(dto.getMajor())
				.createdAt(dto.getCreatedAt())
				.updatedAt(dto.getUpdatedAt())
				.build();
		
	}
}
