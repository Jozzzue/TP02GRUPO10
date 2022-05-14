package ar.edu.unju.edm.until;

import java.util.ArrayList;


import org.springframework.stereotype.Component;

import ar.edu.unju.edm.model.Alumno;


// Resolucion del Punto 8, al no trabajar con ingreso de datos en menu de vista, Se crearan metodos 
// que resuelvan las distintas opciones del menu solicitado en la consigna, y se mostraran en vistas por aparte
// Los datos que requieran ser ingresados seran ingresados en el controlador.
@Component 
public class ListaAlumnos {
	
	private ArrayList<Alumno> listado = new ArrayList<>();
	public ListaAlumnos() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Alumno> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Alumno> listado) {
		this.listado = listado;
	}
	
	

}
