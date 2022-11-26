package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductDAO;

@RestController
@RequestMapping("/rest")
public class MainController {
	@Autowired
	ProductDAO productDAO;
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<>();
		products= productDAO.findAllProduct();
		return products;
	}
}
