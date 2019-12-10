package com.reservation.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@javax.persistence.Table(name = "tableaux")
public class Table {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ;
	private String numero_table;
	private String status;
	private int nbre_place;
	public Table() {
		super();
	}
	public Table(String numero_table, String status, int nbre_place) {
		super();
		this.numero_table = numero_table;
		this.status = status;
		this.nbre_place = nbre_place;
	}
	public Table(int id, String numero_table, String status, int nbre_place) {
		super();
		this.id = id;
		this.numero_table = numero_table;
		this.status = status;
		this.nbre_place = nbre_place;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero_table() {
		return numero_table;
	}
	public void setNumero_table(String numero_table) {
		this.numero_table = numero_table;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNbre_place() {
		return nbre_place;
	}
	public void setNbre_place(int nbre_place) {
		this.nbre_place = nbre_place;
	}
	
	
}
