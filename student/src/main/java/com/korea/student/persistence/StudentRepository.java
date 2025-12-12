package com.korea.student.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.student.model.StudentEntity;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	Optional<StudentEntity> findByStudntId(int studentId);
}
