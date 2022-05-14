package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto4;
import ar.edu.unju.edm.until.NumerosPunto4;

@Controller
public class Punto4Controller {
	@GetMapping("/mostrarPunto4")
	public String getPunto4Page(Model model) {
		
		//Creacion de los numeros
		Punto4 aPunto4n1 = new Punto4(12,"?");
		Punto4 aPunto4n2 = new Punto4(34,"?");
		Punto4 aPunto4n3 = new Punto4(55,"?");
		Punto4 aPunto4n4 = new Punto4(23,"?");
		Punto4 aPunto4n5 = new Punto4(77,"?");
		Punto4 aPunto4n6 = new Punto4(91,"?");
		Punto4 aPunto4n7 = new Punto4(56,"?");
		Punto4 aPunto4n8 = new Punto4(69,"?");
		
		//Par o Impar
		aPunto4n1.setPar(aPunto4n1.esPar(aPunto4n1.getNum()));
		aPunto4n2.setPar(aPunto4n2.esPar(aPunto4n2.getNum()));
		aPunto4n3.setPar(aPunto4n3.esPar(aPunto4n3.getNum()));
		aPunto4n4.setPar(aPunto4n4.esPar(aPunto4n4.getNum()));
		aPunto4n5.setPar(aPunto4n5.esPar(aPunto4n5.getNum()));
		aPunto4n6.setPar(aPunto4n6.esPar(aPunto4n6.getNum()));
		aPunto4n7.setPar(aPunto4n7.esPar(aPunto4n7.getNum()));
		aPunto4n8.setPar(aPunto4n8.esPar(aPunto4n8.getNum()));
		
		
		//Agrego los numeros
		NumerosPunto4 numeros = new NumerosPunto4();
		numeros.getNumbers().add(aPunto4n1);
		numeros.getNumbers().add(aPunto4n2);
		numeros.getNumbers().add(aPunto4n3);
		numeros.getNumbers().add(aPunto4n4);
		numeros.getNumbers().add(aPunto4n5);
		numeros.getNumbers().add(aPunto4n6);
		numeros.getNumbers().add(aPunto4n7);
		numeros.getNumbers().add(aPunto4n8);
		
		//Envio los numeros
		model.addAttribute("Numeros", numeros.getNumbers());
		
		//String sipar = "PAR", nopar = "IMPAR";
		
		
		return "TP02-Punto4";
}
}

