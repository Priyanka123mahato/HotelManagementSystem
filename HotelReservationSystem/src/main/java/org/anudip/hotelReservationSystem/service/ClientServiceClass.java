package org.anudip.hotelReservationSystem.service;

import java.util.List;

import org.anudip.hotelReservationSystem.bean.ClientService;
import org.anudip.hotelReservationSystem.dao.ClientServiceRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceClass {
	 private final ClientServiceRepository clientServiceRepository;

	   
	    public ClientServiceClass( ClientServiceRepository clientServiceRepository) {
	        this.clientServiceRepository = clientServiceRepository;
	    }

	    public List<ClientService> getEntitiesByClientId(Long clientId) {
	    	 List<ClientService> result = clientServiceRepository.findAllByClientId(clientId);
	    	    return result;
	    }
	    
	  
}
