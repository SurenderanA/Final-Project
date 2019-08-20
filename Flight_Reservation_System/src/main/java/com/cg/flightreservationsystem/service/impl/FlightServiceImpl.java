package com.cg.flightreservationsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightreservationsystem.dao.FlightDao;
import com.cg.flightreservationsystem.dto.CustomerDetailsDTO;
import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.service.FlightService;

/**
 * Search Flight operations....
 */

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightDao flightDao;

	private List<FlightDTO> flightViewDTOs;

	public FlightServiceImpl() {

	}

	public void setFlightDao(FlightDao flightDao) {
		this.flightDao = flightDao;
	}

	public List<FlightDTO> searchFlights(CustomerDetailsDTO customerdetailsDTO) {

		flightViewDTOs = flightDao.flightDetails(customerdetailsDTO);
		System.out.println("return service");
		return flightViewDTOs;
	}
}
