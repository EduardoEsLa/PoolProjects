package com.practice.spring.movie_rental.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MovieEntity {

	@Getter @Setter	private Integer id;
	@Getter @Setter	private String title;
	@Getter @Setter	private String genre;
	@Getter @Setter	private Integer year;
	@Getter @Setter	private String classification;
	@Getter @Setter	private Integer quantity;
	@Getter @Setter	private String description;
	
	
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