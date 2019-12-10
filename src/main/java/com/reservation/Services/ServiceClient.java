package com.reservation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.DAO.I_Client;
import com.reservation.Entity.Client;

@Service
public class ServiceClient implements I_ServiceClient{
@Autowired
private I_Client dao_c;
public void AddUpClient(Client c) {
	dao_c.save(c);
}
public List<Client> selectAllclt(){
	return dao_c.findAll();
}
public Client selectionclrId(int id) {
	return dao_c.getOne(id);
}
public void deletClient(int id) {
	dao_c.deleteById(id);
}
}
