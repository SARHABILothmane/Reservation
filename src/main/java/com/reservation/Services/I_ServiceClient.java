package com.reservation.Services;

import java.util.List;

import com.reservation.Entity.Client;

public interface I_ServiceClient {
	public void AddUpClient(Client c);
	public List<Client> selectAllclt();
	public Client selectionclrId(int id);
	public void deletClient(int id);
}
