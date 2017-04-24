package com.practice.spring.movie_rental.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MovieEntity {

	private Integer id;
	private String title;
	private String genre;
	private Integer year;
	private String classification;
	private Integer quantity;
	private String description;
	
	
	/**
	 * Constructors of the fields
	 * @param id
	 * @param title
	 * @param genre
	 * @param year
	 * @param classification
	 * @param quantity
	 * @param description
	 */
	public MovieEntity(Integer id, String title, String genre, Integer year, String classification, Integer quantity,
			String description) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.year = year;
		this.classification = classification;
		this.quantity = quantity;
		this.description = description;
	}	
}