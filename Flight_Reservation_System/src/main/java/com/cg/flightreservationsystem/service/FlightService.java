package com.cg.flightreservationsystem.service;

import java.util.List;

import com.cg.flightreservationsystem.dto.CustomerDetailsDTO;
import com.cg.flightreservationsystem.dto.FlightDTO;

public interface FlightService {

	List<FlightDTO> searchFlights(CustomerDetailsDTO customerdetailsDTO);

}