package com.korea.Book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.Book.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("Book")
@RequiredArgsConstructor
public class BookController {

	public final BookService service;
	
	
	
	
}
