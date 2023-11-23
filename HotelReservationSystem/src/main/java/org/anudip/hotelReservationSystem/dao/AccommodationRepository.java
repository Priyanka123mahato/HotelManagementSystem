package org.anudip.hotelReservationSystem.dao;

import java.util.List;

import org.anudip.hotelReservationSystem.bean.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface AccommodationRepository extends JpaRepository<Accommodation, String> {
	@Query("select accommodationId from Accommodation")
	public List<String> getAllAccommodationIds();

}
