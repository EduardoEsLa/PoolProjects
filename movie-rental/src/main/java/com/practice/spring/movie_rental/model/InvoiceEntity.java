package com.practice.spring.movie_rental.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "INVOICE")
public class InvoiceEntity {

	@Id
	@Column(name = "INVOICE_NO", nullable = false)	
	private Integer invoice_no;
	
	@Column(name = "CUSTOMER_ID", nullable = false)
	private Integer customer_id;
	
	@Column(name = "MOVIE_ID", nullable = false)
	private Integer movie_id;
	
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
	public InvoiceEntity(Integer invoice_no, Integer customer_id, Integer movie_id, float price, Date rental_date,
			Date return_date, Integer quantity, float total) {
		this.invoice_no = invoice_no;
		this.customer_id = customer_id;
		this.movie_id = movie_id;
		this.price = price;
		this.rental_date = rental_date;
		this.return_date = return_date;
		this.quantity = quantity;
		this.total = total;
	}
}
