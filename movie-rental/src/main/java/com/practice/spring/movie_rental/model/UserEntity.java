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
@Table(name = "USER")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", columnDefinition = "INTEGER")
	private Integer id;
	
	@Column(name = "USERNAME", nullable = false)
	private String username;
	
	@Column(name = "PASSWORD", nullable = false)	
	private String password;
	
	@Column(name = "USERROLE", nullable = false)
	private String userRole;
	
	/**
	 * Constructor of the fields
	 * @param id
	 * @param username
	 * @param password
	 */
	public UserEntity(Integer id, String username, String password, String userRole) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.userRole = userRole;	
	}
}
