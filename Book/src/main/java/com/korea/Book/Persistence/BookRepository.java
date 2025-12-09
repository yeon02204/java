package com.korea.Book.Persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.Book.model.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long>{

}
