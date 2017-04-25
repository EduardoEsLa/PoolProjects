package com.practice.spring.movie_rental.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "NAME", columnDefinition = "VARCHAR", length = 100, nullable = false)	
	private String name;

	@Column(name = "LASTNAME", columnDefinition = "VARCHAR", length = 100)	
	private String lastname;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTHDAY")
	private Date birthday;
	
	@Column(name = "ADDRESS", columnDefinition = "VARCHAR", length = 100)
	private String address;
	
	@Column(name = "EMAIL", columnDefinition = "VARCHAR", length = 50)
	private String email;
	
	@Column(name = "PHONE", columnDefinition = "VARCHAR", length = 12)
	private String phone;
	
	@Column(name = "USER_ID")
	@OneToOne
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
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
}
