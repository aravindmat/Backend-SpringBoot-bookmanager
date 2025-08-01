package com.example.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.basic.entity.Book;

public interface Bookrepository extends JpaRepository<Book,Long>{

}
