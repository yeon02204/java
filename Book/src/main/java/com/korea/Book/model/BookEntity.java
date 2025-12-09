package com.korea.Book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="Book")
public class BookEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String author;
	private int price;
	// LocalDeteTime creatsdAt;
}
