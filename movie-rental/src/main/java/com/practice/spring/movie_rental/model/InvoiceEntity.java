package com.practice.spring.movie_rental.model;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class InvoiceEntity {

	@Getter @Setter private Integer invoice_no;
	@Getter @Setter private Integer customer_id;
	@Getter @Setter private Integer movie_id;
	@Getter @Setter private float price;
	@Getter @Setter private Date rental_date;
	@Getter @Setter private Date return_date;	
	@Getter @Setter private Integer quantity;
	@Getter @Setter private float total;
	
	
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
		super();
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
