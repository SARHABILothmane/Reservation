package com.reservation.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.Entity.Reservation;

@Repository
public interface I_Reservation extends JpaRepository<Reservation, Integer>{

}
