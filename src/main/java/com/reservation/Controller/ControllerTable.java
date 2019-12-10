package com.reservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reservation.Entity.Table;
import com.reservation.Services.I_ServiceTable;

@Controller
public class ControllerTable {
@Autowired
I_ServiceTable ServiceTable;
@RequestMapping("/afficheTable")
public String selecttable(Model m) {
		List<Table> l = ServiceTable.selectAlltable();
		Table t = new Table();
		m.addAttribute("showAlltable",l);
		m.addAttribute("t",t);
		return "table";
}
@RequestMapping("/SaveTable")
public String AddUpTable(Table t) {
	ServiceTable.AddUpTable(t);
	return "redirect:/afficheTable";
}
@RequestMapping("/updateTable")
public String update(@RequestParam("id") int id ,  Model model) {
	Table t = ServiceTable.selectTableId(id);
	List<Table> l = ServiceTable.selectAlltable();
	model.addAttribute("showAlltable", l);
	model.addAttribute("t",t);
	return "table";
}
@RequestMapping("/deletetable/{id}")
public String delete(@PathVariable("id") int id) {
	ServiceTable.deletTable(id);
	return "redirect:/afficheTable";
}
}
