package com.practice.spring.movie_rental.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "INVOICE")
public class InvoiceEntity {

	@Id
	@Column(name = "INVOICE_NO", nullable = false)	
	private Integer invoice_no;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	private CustomerEntity customerEntity;
	
	@OneToMany
	@JoinColumn(name = "MOVIE_ID", nullable = false)
	private Set<MovieEntity> movieEntity;
	
	@Column(name = "PRICE", nullable = false)
	private float price;
	
	@Column(name = "RENTAL_DATE", nullable = false)
	private Date rental_date;

	@Column(name = "RETURN_DATE", nullable = false)
	private Date return_date;	
	
	@Column(name = "QUANTITY", nullable = false)
	private Integer quantity;
	
	@Column(name = "TOTAL", nullable = false)
	private float total;
	
	
	/**
	 * Constructor of the fields
	 * @param invoice_no
	 * @param customer_id
	 * @param movie_id
	 * @param price
	 * @param rental_date
	 * @param return_date
	 * @param quantity
	 * @param total
	 */
	public InvoiceEntity(Integer invoice_no, CustomerEntity customerEntity, Set<MovieEntity> movieEntity, float price, Date rental_date,
			Date return_date, Integer quantity, float total) {
		this.invoice_no = invoice_no;
		this.customerEntity = customerEntity;
		this.movieEntity = movieEntity;
		this.price = price;
		this.rental_date = rental_date;
		this.return_date = return_date;
		this.quantity = quantity;
		this.total = total;
	}
}
