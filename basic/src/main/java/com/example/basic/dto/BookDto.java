package com.example.basic.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@JsonPropertyOrder({ "title", "author", "price" })
public class BookDto {
	
	@NotBlank(message="Title is required")
	private String title;
	
	@NotBlank(message = "Author is required")
	private String author;
	
	@Positive(message = "Price should be greater than 0")
	private double price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
