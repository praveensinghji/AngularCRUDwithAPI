package com.hotel.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.app.entity.Hotel;
import com.hotel.app.repo.HotelRepo;

@Service
public class HotelService {
	private HotelRepo repo;

	@Autowired
	public HotelService(HotelRepo repo) {
		this.repo = repo;
	}
	
	public List<Hotel> getAllReservation(){
		return repo.findAll();
	}
	
	public Hotel getReservation(int id) {
		return repo.findById(id).get();
	}
	
	public void saveReservation(Hotel hotel) {
		repo.save(hotel);
	}
	
	public void deleteReservation(int id) {
		repo.deleteById(id);
	}
}
