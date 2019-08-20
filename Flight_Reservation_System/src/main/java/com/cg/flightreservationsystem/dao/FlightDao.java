package com.cg.flightreservationsystem.dao;

import java.util.List;

import com.cg.flightreservationsystem.dto.CustomerDetailsDTO;
import com.cg.flightreservationsystem.dto.FlightDTO;

public interface FlightDao {

	List<FlightDTO> flightDetails(CustomerDetailsDTO customer);

}
