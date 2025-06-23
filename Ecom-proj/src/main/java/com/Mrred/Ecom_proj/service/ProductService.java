package com.Mrred.Ecom_proj.service;

import java.io.IOException;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.Mrred.Ecom_proj.model.Product;
import com.Mrred.Ecom_proj.repo.ProductRepo;



@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
		
	
	
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	public Product getProductById(int id) {
		return repo.findById(id).orElse(new Product());
	}

	public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
		product.setImageName(imageFile.getOriginalFilename());
		product.setImageType(imageFile.getContentType());
		product.setImageDate(imageFile.getBytes());
		
		return repo.save(product);
	}

	public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
		
		product.setImageName(imageFile.getOriginalFilename());
		product.setImageType(imageFile.getContentType());
		product.setImageDate(imageFile.getBytes());
		
		return repo.save(product);
		
	}

	public void deleteProduct(int id) {
		repo.deleteById(id);
	}

	public List<Product> searchProducts(String keyword) {
		 return repo.searchProducts(keyword);
		 
	}
	
	
	
}
