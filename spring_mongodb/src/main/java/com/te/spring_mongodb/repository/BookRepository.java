package com.te.spring_mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.te.spring_mongodb.entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

	
}
