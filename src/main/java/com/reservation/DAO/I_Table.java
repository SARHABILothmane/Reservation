package com.reservation.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.Entity.Table;

@Repository
public interface I_Table extends JpaRepository<Table, Integer>{

}
