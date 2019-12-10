package com.reservation.Services;

import java.util.List;

import com.reservation.Entity.Table;

public interface I_ServiceTable {
	public void AddUpTable(Table t);
	public List<Table> selectAlltable();
	public Table selectTableId(int id);
	public void deletTable(int id) ;
}
