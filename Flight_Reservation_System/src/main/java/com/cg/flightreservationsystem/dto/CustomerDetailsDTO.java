package com.cg.flightreservationsystem.dto;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * customer detail DTO
 * 
 * @author trainee
 *
 */
@Entity
public class CustomerDetailsDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String source;
	private String destination;
	private Date date;
	private int numberOfPassengers;

	public CustomerDetailsDTO(String source, String destination, Date date, int numberOfPassengers) {
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.numberOfPassengers = numberOfPassengers;
	}

	public CustomerDetailsDTO() {

	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDepartureDate() {
		return date;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
}
