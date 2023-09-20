package com.coforge.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.coforge.dao.ProductRepository;
import com.coforge.exception.ProductException;
import com.coforge.model.Product;

@Service
public class ProductService {

	 @Autowired
	 ProductRepository productRepository;
	 
	 public List<Product> getAllProducts() throws ProductException
	 {
		 if(productRepository.findAll().isEmpty()) 
		 {
		  throw new ProductException("Product list is empty");
		 }
		 else 
		 {
			 return productRepository.findAll();
		 }
	 }

	public Product addProduct(Product p) throws ProductException 
	{
		 Optional<Product> findById = productRepository.findById((long) p.getPrid());
		 if(findById.isEmpty()) 
		 {
		  productRepository.save(p);
		  return p;
		 }
		 else 
		 {
		  throw new ProductException("Product is already present");
		 }
	 }

	public Product searchProduct(long id) throws ProductException 
	{
		 Optional<Product> findById = productRepository.findById(id);
		 if(findById.isEmpty()) 
		 {
		  throw new ProductException("Product is already present");
		 }
		 else 
		 {
		  return findById.get();
		 }
	}

	public Product removeProduct(long id) throws ProductException
	{
		 Optional<Product> findById = productRepository.findById(id);
		 if(findById.isEmpty()) 
		 {
		  throw new ProductException("Product is already present");
		 }
		 else 
		 {
	      productRepository.deleteById(id);
		  return findById.get();
		 }
	}
	
	
	public Product updateProduct(Product p) throws ProductException 
	{
		 Optional<Product> findById = productRepository.findById((long) p.getPrid());
		 if(findById.isEmpty()) 
		 {
			 throw new ProductException("Product is not present");
		 }
		 else 
		 {
		  productRepository.save(p);
		  return p;
		 }
	 }
}