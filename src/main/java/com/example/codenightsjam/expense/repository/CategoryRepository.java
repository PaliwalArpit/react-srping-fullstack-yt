package com.example.codenightsjam.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codenightsjam.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	// returns fields when added find + By + field name (name here)
		Category findByName(String name);
		
		
}
