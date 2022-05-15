package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Punto5Controller {

	@GetMapping("mostrarPunto5")
	public ModelAndView getPunto5(@RequestParam(name="cad") String text) {
	//invertir cadena
		
		int j=0 , size = text.length();
		char inverted[] = new char[size];
		
		for (int i=size-1; i >= 0; i--) {
			inverted[j] =  text.charAt(i);
			j++;
		}
		
	//enviar cadena inversa
		ModelAndView modelView = new ModelAndView("TP02-Punto5");
		modelView.addObject("Punto5", String.valueOf(inverted));
		
     return modelView;
	}
	 
}