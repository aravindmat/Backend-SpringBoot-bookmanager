package com.example.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.basic.dto.BookDto;
import com.example.basic.entity.Book;
import com.example.basic.exception.ResourceNotFoundException;
import com.example.basic.repository.Bookrepository;

@Service
public class Bookserviceimpl implements Bookservice{
	
	@Autowired
	private Bookrepository repo;
	
	@Override
	public Book createBook(BookDto bookDto) {
		Book book = new Book();
		book.setTitle(bookDto.getTitle());
		book.setAuthor(bookDto.getAuthor());
		book.setPrice(bookDto.getPrice());
		return repo.save(book);
	}
	
	@Override
	public Book getBookById(Long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found with id: "+id));
	}
	
	@Override
	public List<Book> getAll(){
		return repo.findAll();
	}
	
	@Override
	public Book updateBook(Long id, BookDto bookDto) {
		Book existing = getBookById(id);
		existing.setTitle(bookDto.getTitle());
		existing.setAuthor(bookDto.getAuthor());
		existing.setPrice(bookDto.getPrice());
		return repo.save(existing);
	}
	
	@Override
	public void deleteBook(Long id) {
		Book book = getBookById(id);
		repo.delete(book);
	}
}
