package com.practice.spring.movie_rental.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
@NoArgsConstructor
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "NAME", nullable = false)	
	private String name;

	@Column(name = "LASTNAME", nullable = false)	
	private String lastname;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTHDAY")
	private Date birthday;
	
	@Column(name = "ADDRESS", nullable = false)
	private String address;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Column(name = "PHONE", nullable = false)
	private String phone;
	
	@OneToOne
	@JoinColumn(name = "USER_ID")
	private UserEntity userentity;
	
	
	/**
	 * Constructor of the fields
	 * @param id
	 * @param name
	 * @param lastname
	 * @param birthday
	 * @param address
	 * @param email
	 * @param phone
	 */
	public CustomerEntity(Integer id, String name, String lastname, Date birthday, String address, String email,
			String phone) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
}
