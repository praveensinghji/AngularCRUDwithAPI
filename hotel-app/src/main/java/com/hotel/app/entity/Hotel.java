package com.hotel.app.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel_reservation")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="guestname")
	private String guestName;
	@Column(name="guestemail")
	private String guestEmail;
	@Column(name="mobno")
	private String mobNo;
	@Column(name="roomno")
	private int roomNo;
	@Column(name="checkindate")
	private LocalDate checkInDate;
	@Column(name="checkoutdate")
	private LocalDate checkOutDate;
	
	public Hotel() {
	}

	public Hotel(int id, String guestName, String guestEmail, String mobNo, int roomNo, LocalDate checkInDate,
			LocalDate checkOutDate) {
		this.id = id;
		this.guestName = guestName;
		this.guestEmail = guestEmail;
		this.mobNo = mobNo;
		this.roomNo = roomNo;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", guestName=" + guestName + ", guestEmail=" + guestEmail + ", mobNo=" + mobNo
				+ ", roomNo=" + roomNo + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + "]";
	}
	
	
	
}
