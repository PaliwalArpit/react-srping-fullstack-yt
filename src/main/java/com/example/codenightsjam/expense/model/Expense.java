package com.example.codenightsjam.expense.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="expense")
public class Expense {

	@Id
	private Long id;
	
	private Instant expensedate;
	
	private String description;
	
	// expense Id (PK), date, description, user id , category id (FK)
	
	@ManyToOne // sql join -> jpa and hibernate is doing this // many expenses goes to one category
	private Category category;
	
	@ManyToOne // Many expenses goes to one user
	private User user;
	
	
}
