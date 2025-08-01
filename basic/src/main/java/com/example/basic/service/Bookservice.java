package com.example.basic.service;

import java.util.List;

import com.example.basic.dto.BookDto;
import com.example.basic.entity.Book;

public interface Bookservice {
	
	Book createBook(BookDto bookDto);
	Book getBookById(Long id);
	List <Book> getAll();
	Book updateBook(Long id, BookDto bookDto);
	void deleteBook(Long id);
}
