package com.coforge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coforge.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}