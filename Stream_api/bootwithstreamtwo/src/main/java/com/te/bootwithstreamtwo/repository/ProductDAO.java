package com.te.bootwithstreamtwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.bootwithstreamtwo.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer>{

}
