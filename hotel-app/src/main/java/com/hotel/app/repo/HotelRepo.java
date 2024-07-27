package com.hotel.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer>{
	
}
