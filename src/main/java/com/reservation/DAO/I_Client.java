package com.reservation.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.Entity.Client;

@Repository
public interface I_Client extends JpaRepository<Client, Integer>{

}
