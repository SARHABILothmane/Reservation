package com.reservation.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reservation.Entity.Reservation;
import com.reservation.Entity.Table;
import com.reservation.Services.I_ServiceReservation;
import com.reservation.Services.I_ServiceTable;

@Controller
public class ControllerReservation {
@Autowired
I_ServiceReservation ServiceReservation;
@Autowired
I_ServiceTable ServiceTable;
@RequestMapping("/afficheReservation")
public String selectReservation(@RequestParam("id") int id , Model m) {
	List<Reservation> l = ServiceReservation.selectAllResrvation();
//	List<Table> ll = ServiceTable.selectAlltable();
	Reservation r = new Reservation();
	m.addAttribute("r", r);
	m.addAttribute("showAllReservation", l);
//	m.addAttribute("showAlltable", ll);
	m.addAttribute("id", id);
return "reservation";	
}
@RequestMapping("/SaveReservation")
public String AddUpclt(@ModelAttribute("r") Reservation r) {
	Date date = new Date();
	r.setDate_reservation(date);
	ServiceReservation.AddUpReservation(r);
	String ss = "redirect:/afficheReservation?id="+r.getId();
return ss;
}
//@RequestMapping("/updateReservation")
//public String update(@RequestParam("id") int id ,  Model model ) {
//	Reservation r = ServiceReservation.SelectReservationId(id);
//	List<Reservation> l = ServiceReservation.selectAllResrvation();
//	
//	model.addAttribute("showAllReservation", l);
//	model.addAttribute("r",r);
//return "reservation";
//}
//
//@RequestMapping("/deleteReservation/{id}")
//public String delete(@PathVariable("id") int id ) {
//	ServiceReservation.DelectReservation(id);
//return "redirect:/afficheReservation";
//}

}
