package com.korea.Book.service;

import java.security.KeyStore.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.Book.Persistence.BookRepository;
import com.korea.Book.dto.BookDTO;
import com.korea.Book.model.BookEntity;



import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	
	private final BookRepository repository;

	public BookDTO creatBook(BookEntity entity) {
	
		if(entity.getTitle() == null|| entity.getTitle() == "") {
			throw new RuntimeException("Unknown Title");
		}
		
		if (entity.getAuthor() == null) {
			throw new RuntimeException("Unknown Author");
		}
		
		if(entity.getPrice()<0) {
			throw new RuntimeException("Unknown price");
		}
		
		repository.save(entity);
		
		
		
		// return dto;
		
	}
	
	// public BookDTO getAllBook() {
		
	// }
}
