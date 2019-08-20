package com.cg.flightreservationsystem.dto;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * 
 * Schedule Data Transfer Object
 *
 */
@Entity
@Table(name = "schedule")
public class ScheduleDTO implements Serializable {

	/**
	 * Schedule DTO class
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCHEDULE_SEQ")
	@SequenceGenerator(name = "SCHEDULE_SEQ", sequenceName = "schedule_seq")
	@Column(name = " schedule_id")
	private int scheduleId;

	@Column(name = "arrival_date")
	private Date arrivalDate;
	@Column(name = "departure_date")
	private Date departureDate;
	@Column(name = "arrival_time")
	private String arrivalTime;
	@Column(name = "departure_time")
	private String departureTime;
	@Column(name = " price")
	private double price;

	@OneToOne(mappedBy = "routeDTO")
	private FlightDTO flightDTO ;

	public ScheduleDTO() {
		// TODO Auto-generated constructor stub
	}

	public ScheduleDTO(Date arrivalDate, Date departureDate, String arrivalTime, String departureTime,
			double price) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ScheduleDTO [scheduleId=" + scheduleId + ", arrivalDate=" + arrivalDate + ", departureDate="
				+ departureDate + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + ", price="
				+ price + "]";
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
