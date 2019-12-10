package com.reservation.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Reservation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date date_reservation;
@Temporal(TemporalType.DATE)
//@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date date_arriver;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date date_depart;
private int nbre_personne;

@ManyToOne
@JoinColumn(name="client_id", nullable=false)
private Client client;

@ManyToOne
@JoinColumn(name="table_id", nullable=false)
private Table table;

public Reservation() {
	super();
}

public Reservation(Date date_reservation, Date date_arriver, Date date_depart, int nbre_personne, Client client,
		Table table) {
	super();
	this.date_reservation = date_reservation;
	this.date_arriver = date_arriver;
	this.date_depart = date_depart;
	this.nbre_personne = nbre_personne;
	this.client = client;
	this.table = table;
}

public Reservation(int id, Date date_reservation, Date date_arriver, Date date_depart, int nbre_personne, Client client,
		Table table) {
	super();
	this.id = id;
	this.date_reservation = date_reservation;
	this.date_arriver = date_arriver;
	this.date_depart = date_depart;
	this.nbre_personne = nbre_personne;
	this.client = client;
	this.table = table;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Date getDate_reservation() {
	return date_reservation;
}

public void setDate_reservation(Date date_reservation) {
	this.date_reservation = date_reservation;
}

public Date getDate_arriver() {
	return date_arriver;
}

public void setDate_arriver(Date date_arriver) {
	this.date_arriver = date_arriver;
}

public Date getDate_depart() {
	return date_depart;
}

public void setDate_depart(Date date_depart) {
	this.date_depart = date_depart;
}

public int getNbre_personne() {
	return nbre_personne;
}

public void setNbre_personne(int nbre_personne) {
	this.nbre_personne = nbre_personne;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public Table getTable() {
	return table;
}

public void setTable(Table table) {
	this.table = table;
}

}
