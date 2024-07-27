package com.hotel.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.entity.Hotel;
import com.hotel.app.service.HotelService;

@RestController
@CrossOrigin("*")
public class HotelRestController {
	private HotelService service;

	@Autowired
	public HotelRestController(HotelService service) {
		this.service = service;
	}
	
	@GetMapping("/allList")
	public ResponseEntity<?> getAllReservation(){
		return ResponseEntity.ok(service.getAllReservation());
	}
	
	@GetMapping("/allList/{id}")
	public ResponseEntity<?> getReservation(@PathVariable int id) {
		return ResponseEntity.ok(service.getReservation(id));
	}
	
	@PostMapping("/add")
	public void saveReservation(@RequestBody Hotel hotel) {
		service.saveReservation(hotel);
	}
	
	@PutMapping("/update")
	public void updateReservation(@RequestBody Hotel hotel) {
		service.saveReservation(hotel);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteReservation(@PathVariable int id) {
		service.deleteReservation(id);
	}
}
