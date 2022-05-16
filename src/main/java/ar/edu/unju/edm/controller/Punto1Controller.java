package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Persona;

@Controller
public class Punto1Controller {

	@Autowired
	Persona aPersona;

	@GetMapping("/mostrarPunto1")
	public ModelAndView getPunto1(@RequestParam("year") String year, @RequestParam("nombre") String nombre,
			Model model) {

		// Cargar datos de la persona

		aPersona.setNombre(nombre);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fnac = LocalDate.parse(year, formatter);
		aPersona.setFechanac(fnac);

		ModelAndView modelView = new ModelAndView("TP02-Punto1");
		modelView.addObject("pNombre", aPersona.getNombre());
		modelView.addObject("pNac", aPersona.getFechanac());
		modelView.addObject("pEdad", aPersona.obtenerEdad());
		modelView.addObject("pSigno", aPersona.obtenerSigno());
		modelView.addObject("pEstacion", aPersona.obtenerEstacion());

		return modelView;
	}

}
