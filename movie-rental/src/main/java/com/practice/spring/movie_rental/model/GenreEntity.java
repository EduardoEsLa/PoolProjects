package com.practice.spring.movie_rental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "GENRE")
public class GenreEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", columnDefinition = "INTEGER")
	private Integer id;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	
	/**
	 * Constructor of the fields
	 * @param id
	 * @param genres
	 */
	public GenreEntity(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	
	
}
