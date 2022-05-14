package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

/*
 * Nombre, apellido, Libreta Universitaria, notas (arreglo que almacena 5 notas
 * de tipo double)
 */
public class Alumno {
	private String Nombre;
	private String Apellido;
	private String LibretaUni;
	private double Notas[];

	public double[] getNotas(){
	    return Notas;
	}

	public void setNotas(double[] notas){
	    this.Notas = notas;
	}

	public String getLibretaUni() {
		return LibretaUni;
	}

	public void setLibretaUni(String libretaUni) {
		LibretaUni = libretaUni;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/*
	 * Construir dentro de la clase Alumno los siguientes métodos:
	 * calcularPromedio() retorna el promedio de las notas del alumno.
	 * obtenerNotaMaxima() que retorna la nota máxima.
	 */
	
	public double calcularPromedio() {
		double promedio=0;
		//Primero tengo que sumar todas las notas
		for (int i=0; i<Notas.length; i++) {
			promedio = promedio + Notas[i];
		}
		//Ahora se debe dividir la suma total por la cantidad de notas
		promedio = promedio / Notas.length;
		return promedio;
	}
	
	public double obtenerNotaMaxima() {
		double maximo=Notas[0]; //Asumo que la nota maxima es la primera
		for (int i=1; i<Notas.length; i++) { // Empiezo la i en 1 porque no es util comparar la misma nota
			if (Notas[i] > maximo) {
				maximo = Notas[i]; // Obtengo el mayor
			}
		}
		return maximo;
	}
	
	public String nombreAlumno() {
		return Nombre;
	}
	
	public String apellidoAlumno() {
		return Apellido;
	}
	
	public String libretaAlumno() {
		return LibretaUni;
	}

	public Alumno() {
	}
}