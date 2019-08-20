package com.cg.flightreservationsystem.dao.impl;



import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.flightreservationsystem.dao.FlightDao;
import com.cg.flightreservationsystem.dto.CustomerDetailsDTO;
import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.utility.JpqlQuery;

/**
 * Search flights based on the Source, Destination and Departure Date
 */
@Repository
@Transactional
public class FlightDaoImpl implements FlightDao {
	@PersistenceContext
	private EntityManager entityManager;
	FlightDTO flightDTO;
	RouteDTO routeDTO;

	public List<FlightDTO> flightDetails(CustomerDetailsDTO customer) {

		String sourcePlace = customer.getSource();
//		System.out.println(sourcePlace);
		String destinationPlace = customer.getDestination();
//		System.out.println(destinationPlace);
		Date localDate = customer.getDepartureDate();
		// TypedQuery<FlightDTO> query =
		// entityManager.createQuery(JpqlQuery.flightQuery,FlightDTO.class);

		Query query =  entityManager.createQuery(JpqlQuery.flightQuery1);
		query.setParameter("source", customer.getSource());
//		System.out.println(sourcePlace);

		query.setParameter("destination", customer.getDestination());
//		System.out.println(destinationPlace);
//
//		query.setParameter("dt", customer.getDepartureDate());
//		System.out.println("hyyyyyy-----" +localDate);

		System.out.println(query.getResultList().isEmpty());
//		return query.getResultList();
		@SuppressWarnings("unchecked")
	
		List<FlightDTO> userList = query.getResultList();
		
//		if(userList.size()!=0){
//			Iterator stIterator=userList.iterator();
//			while(stIterator.hasNext()){
//				FlightDTO st=(FlightDTO)stIterator.next();
//				System.out.print("sname:"+st.getCapacity());
//			}
//		}
//			else
//			{
//				System.out.println("Result List error!!!");
//			}
//		
		System.out.print("capacity :" + query.getResultList());
//		Query query = em.createNativeQuery("select 42 as age, 'Bob' as name from dual", 
//		        MyTest.class);
//
//		FlightDTO myTest = (FlightDTO) query.getResultList().get(0);
//		System.out.println("hyyyyyy-----uuuuu " + userList.size());
//		System.out.println("Result List " + myTest);
		return query.getResultList();

//		List<FlightDTO> flightDTOs = new ArrayList<FlightDTO>();
//		for (FlightDTO flightList : userList) {
//
//			flightList.getFlightId();
//			System.out.println("flight Id :" + flightList.getFlightId());
//			flightList.getCapacity();
//			System.out.println(flightList.getRouteDTO().getSource());
//			flightList.getRouteDTO().getDestination();
//			flightList.getScheduleDTO().getArrivalDate();
//			flightList.getScheduleDTO().getArrivalTime();
//			flightList.getScheduleDTO().getDepartureDate();
//			flightList.getScheduleDTO().getDepartureTime();
//			flightList.getScheduleDTO().getPrice();
//			flightDTOs.add(flightList);
//		}
//		System.out.println("return" + flightDTOs);
//		return flightDTOs;
	}
}