package org.anudip.hotelReservationSystem.dao;

import java.util.List;

import org.anudip.hotelReservationSystem.bean.ClientService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientServiceRepository extends JpaRepository<ClientService,Long> {
	@Query("SELECT c FROM ClientService c WHERE c.clientId = :clientId")
	List<ClientService> findAllByClientId(@Param("clientId") Long clientId);
    
	

}



