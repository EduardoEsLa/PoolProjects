package com.practice.spring.movie_rental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "USER")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", columnDefinition = "INTEGER")
	private Integer id;
	
	@Column(name = "USERNAME", columnDefinition = "VARCHAR", length = 20)
	private String username;
	
	@Column(name = "PASSWORD", columnDefinition = "VARCHAR", length = 20)	
	private String password;
	
	
	/**
	 * Constructor of the fields
	 * @param id
	 * @param username
	 * @param password
	 */
	public UserEntity(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
}
