package com.reservation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.DAO.I_Reservation;
import com.reservation.Entity.Reservation;

@Service
public class ServiceReservation implements I_ServiceReservation{
@Autowired
I_Reservation dao_r;
public void AddUpReservation(Reservation r) {
	dao_r.save(r);
}
public List<Reservation> selectAllResrvation(){
	return dao_r.findAll();
}
public Reservation SelectReservationId(int id) {
	return dao_r.getOne(id);
}
public void DelectReservation(int id) {
	dao_r.deleteById(id);
}
}
