package ar.edu.unju.edm.controller;

/*Permite inyectar unas dependencias con otras dentro de Spring
import org.springframework.beans.factory.annotation.Autowired; 
*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;

import ar.edu.unju.edm.model.Alumno;

//Se usa para indicar que la clase es un controlador Spring
@Controller

public class AlumnoController {

	@GetMapping({"/menu","index","/"})
	public String mostrarMenu() {
		return "menu";
	}

	@GetMapping("/resolverAlumnoP3")

	public String getAlumnoPage(Model model) {
		
		double promedio=0;
		double mayor=0;
		
		Alumno zAlumno = new Alumno();

		double[] notas = new double[]{6.40, 7.50, 9.50, 9.45, 5.25};
		
		model.addAttribute("Notas", Arrays.toString(notas));
		
		zAlumno.setNotas(notas);
		zAlumno.setNombre("Leandro");
		zAlumno.setApellido("Rufino");
		zAlumno.setLibretaUni("EDM");
		
		model.addAttribute("Nombre", zAlumno.getNombre());
		model.addAttribute("Apellido", zAlumno.getApellido());
		model.addAttribute("Libreta", zAlumno.getLibretaUni());
		
		promedio = zAlumno.calcularPromedio();
		
		model.addAttribute("Promedio", promedio);
		
		mayor = zAlumno.obtenerNotaMaxima();
		
		model.addAttribute("Mayor", mayor);
		
		
		return "TP02-Punto3";
	}

}
