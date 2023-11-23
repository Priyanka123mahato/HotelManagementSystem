package org.anudip.hotelReservationSystem.dao;

import java.util.List;

import org.anudip.hotelReservationSystem.bean.Accommodation;
import org.anudip.hotelReservationSystem.bean.Client;
import org.anudip.hotelReservationSystem.bean.Hotel;

public interface HotelDao {
	public void saveHotel(Hotel hotel);//store new hotel
	public List<Hotel> displayAllHotels();
	public Hotel findAHotelById(String hotelId);
	public String generateNewHotelId();
	public List<String> getAllHotelIds();
	public List<Accommodation> displayAllAccommodations(); // Display all accommodations
    public Accommodation findAAccommodationById(String accommodationId);
    public List<String> getAllAccommodationIds(); // Retrieve a list of all accommodation IDs
	public long generateNewClientId();
	public long generateNewClientServiceId();
	public List<Hotel> displayAllClients();
	public List<Long> getAllClientIds();
	public  Client findAClientById(Long clientId);



}