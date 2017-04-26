package com.practice.spring.movie_rental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "GENRE")
@NoArgsConstructor
public class GenreEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", columnDefinition = "INTEGER")
	private Integer id;
	
	@Column(name = "GENRES", nullable = false)
	private String genres;

	
	/**
	 * Constructor of the fields
	 * @param id
	 * @param genres
	 */
	public GenreEntity(Integer id, String genres) {
		this.id = id;
		this.genres = genres;
	}
	
	
}
