package com.korea.user.model;

import java.security.PrivateKey;

import org.hibernate.annotations.ValueGenerationType;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "kuser")
public class UserEntity {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
}
