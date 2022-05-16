package ar.edu.unju.edm.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Punto6Controlller {

	
	@GetMapping("mostrarPunto6")
	public ModelAndView getPunto6(){
	 //cargar 10 numeros enteros
		//para que sean aleatorios: (X=limite superior , Y=limite inferior) 
		// int numero = (int)(Math.random()*(X-Y+1)+Y
		
		int[] numbers = new int[10];
		int[] reversed = new int[10];
		int j=9;
		for (int i=0; i < 10 ; i++) {
		      numbers[i] = (int)(Math.random()*(100-1+1)+1);
		      reversed [j] = numbers[i];
		      j--;
		}
		
		
	//enviar cadena de numeros invertida	
		ModelAndView modelView = new ModelAndView("TP02-Punto6");
		modelView.addObject("Punto6_1", Arrays.toString(numbers));
		modelView.addObject("Punto6", Arrays.toString(reversed));
		
		return modelView;
	}
}
