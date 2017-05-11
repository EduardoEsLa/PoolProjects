package com.practice.spring.movie_rental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "MOVIE")
public class MovieEntity {

	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Column(name = "TITLE", nullable = false)
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "GENRE_ID", nullable = false)
	private GenreEntity genreEntity;
	
	@Column(name = "YEAR", nullable = false)
	private Integer year;
	
	@Column(name = "CLASSIFICATION", nullable = false)
	private String classification;
	
	@Column(name = "QUANTITY", nullable = false)
	private Integer quantity;
	
	@Column(name = "DESCRIPTION", nullable = false)
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
	public MovieEntity(Integer id, String title, GenreEntity genreEntity, Integer year, String classification, Integer quantity,
			String description) {
		this.id = id;
		this.title = title;
		this.genreEntity = genreEntity;
		this.year = year;
		this.classification = classification;
		this.quantity = quantity;
		this.description = description;
	}	
}