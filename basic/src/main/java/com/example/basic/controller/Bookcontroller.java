package com.example.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.dto.BookDto;
import com.example.basic.entity.Book;
import com.example.basic.service.Bookservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/book")
@CrossOrigin(origins = "http://localhost:5173")
public class Bookcontroller {

	@Autowired
	private Bookservice service;
	
	@PostMapping
	public Book createBook(@RequestBody @Valid BookDto bookDto) {
		return service.createBook(bookDto);
	}
	
	@GetMapping("/{id}")
	public Book getBookByID(@PathVariable Long id) {
		return service.getBookById(id);
	}
	
	@GetMapping
	public List<Book> getAll(){
		return service.getAll();
	}
	
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody @Valid BookDto bookDto) {
		return service.updateBook(id, bookDto);
	}
	
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable Long id) {
		service.deleteBook(id);
		return "Book deleted successfully!";
	}	
	
	
	
	
}
