package com.cg.flightreservationsystem.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightreservationsystem.dto.CustomerDetailsDTO;
import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.service.FlightService;

@RestController
@RequestMapping(value = "/Flight")
public class FlightController {
	@Autowired
	FlightService flightService;
	List<FlightDTO> flightDTOs;
	CustomerDetailsDTO customerDetailsDTO = new CustomerDetailsDTO();
	
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}

	@RequestMapping( value = "/Search",method = RequestMethod.POST, produces = "application/json",consumes = "application/json")
	public  List<FlightDTO> getFlightDetail(@RequestBody CustomerDetailsDTO  customerDetailsDTO)
	{
		flightDTOs=flightService.searchFlights(customerDetailsDTO);
		System.out.println("return controller");
		return flightDTOs;
	}
	
	
}
