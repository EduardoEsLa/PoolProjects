package com.practice.spring.movie_rental.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserEntity {

	@Getter @Setter private Integer id;
	@Getter @Setter private String username;
	@Getter @Setter private String password;
	
	
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
