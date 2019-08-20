package com.cg.flightreservationsystem.utility;

public class JpqlQuery {

//	public static final String flightQuery = "select r.source,r.destination,s.departureDate,s.arrivalDate,s.departureTime,s.arrivalTime,\r\n" + 
//			"	 s.price,f.capacity from FlightDTO f JOIN f.scheduleDTO s JOIN f.routeDTO r where " 
//			+ " r.source= :source and r.destination= :destination and s.departureDate= :dt";
	
	
	public static final String flightQuery1 = "select f.capacity,r.source,r.destination,s.departureDate,s.arrivalDate,s.departureTime,s.arrivalTime,s.price from FlightDTO f JOIN f.routeDTO r JOIN f.scheduleDTO s where"
			+" r.source= :source and r.destination= :destination"; 
	
	
	
	
//	@QueryHint(flightQuery)
//    FlightDTO findBySoruceDestinationDate(@Param("scheduleDTO") String scheduleId,@Param("routeId") String destination) {
//		return null;
//	}
}
