package com.practice.spring.movie_rental.model;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CustomerEntity {

	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private String lastname;
	@Getter @Setter private Date birthday;
	@Getter @Setter private String address;
	@Getter @Setter private String email;
	@Getter @Setter private String phone;
	@Getter @Setter private UserEntity userentity;
	
	
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
