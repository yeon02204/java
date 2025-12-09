package com.korea.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.user.dto.ResponseDTO;
import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("Kuser")
@RequiredArgsConstructor
public class UserController {

	private final UserService service;

	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody UserDTO dto) {

		UserEntity entity = UserDTO.ToEntity(dto);

		UserEntity created = service.create(entity);

		UserDTO responseDto = new UserDTO(created);

		List<UserDTO> dtos = List.of(responseDto);

		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();

		return ResponseEntity.ok().body(response);
	}

	@GetMapping("/retrieve")
	public ResponseEntity<?> retrieveUser(UserDTO dto) {
		List<UserEntity> entities = service.getAllUsers();

		List<UserDTO> dtos = new ArrayList<>();
		for (UserEntity e : entities) {
			dtos.add(new UserDTO(e));
		}

		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();

		return ResponseEntity.ok().body(response);
	}

	@GetMapping("/search")
	public ResponseEntity<?> searchUser(@RequestParam("email") String email) {
		UserEntity created = service.getUserByEmail(email);

	    UserDTO responseDto = new UserDTO(created);

	    List<UserDTO> dtos = List.of(responseDto);

	    ResponseDTO<UserDTO> response =
	            ResponseDTO.<UserDTO>builder().data(dtos).build();

	    return ResponseEntity.ok().body(response);
	}

}
