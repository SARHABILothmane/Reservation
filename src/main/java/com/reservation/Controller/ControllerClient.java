package com.reservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reservation.Entity.Client;
import com.reservation.Services.I_ServiceClient;

@Controller
public class ControllerClient {
@Autowired
private I_ServiceClient ServiceClient;
@RequestMapping("/afficheClt")
public String selectclt(Model m) {
	List<Client> l = ServiceClient.selectAllclt();
	Client c = new Client();
	m.addAttribute("c", c);
	m.addAttribute("showAllclt", l);
return "clients";	
}
@RequestMapping("/SaveClt")
public String AddUpclt(@ModelAttribute("c") Client c) {
	ServiceClient.AddUpClient(c);
return "redirect:/afficheClt";
}
@RequestMapping("/updateClt")
public String update(@RequestParam("id") int id ,  Model model ) {
	Client c = ServiceClient.selectionclrId(id);
	List<Client> l = ServiceClient.selectAllclt();
	
	model.addAttribute("showAllclt", l);
	model.addAttribute("c",c);
return "clients";
}

@RequestMapping("/deleteclt/{id}")
public String delete(@PathVariable("id") int id ) {
ServiceClient.deletClient(id);
return "redirect:/afficheClt";
}

}
