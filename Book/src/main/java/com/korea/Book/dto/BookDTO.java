package com.korea.Book.dto;

import com.korea.Book.model.BookEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {

	private Long id;
	private String title;
	private String author;
	private int price;

	public BookDTO(BookEntity entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.author = entity.getAuthor();
		this.price = entity.getPrice();
	}
	
	public static BookEntity ToEntity(BookDTO dto) {
		
		return BookEntity.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.author(dto.getAuthor())
				.price(dto.getPrice())
				.build();
	}

}
