package com.reservation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.DAO.I_Table;
import com.reservation.Entity.Table;

@Service
public class ServiceTable implements I_ServiceTable{
@Autowired
private I_Table dao_t;
public void AddUpTable(Table t) {
	dao_t.save(t);
}
public List<Table> selectAlltable(){
	return dao_t.findAll();
}
public Table selectTableId(int id) {
	return dao_t.getOne(id);
}
public void deletTable(int id) {
	dao_t.deleteById(id);
}
}
