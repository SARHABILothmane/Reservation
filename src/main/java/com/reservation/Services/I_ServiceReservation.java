package com.reservation.Services;

import java.util.List;

import com.reservation.Entity.Reservation;

public interface I_ServiceReservation {
	public void AddUpReservation(Reservation r);
	public List<Reservation> selectAllResrvation();
	public Reservation SelectReservationId(int id);
	public void DelectReservation(int id);
}
