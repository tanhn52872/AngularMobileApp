package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, String> {
	@Query(value="select * from Product", nativeQuery = true)
	List<Product> findAllProduct();
	
}
