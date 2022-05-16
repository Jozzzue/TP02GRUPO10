package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Persona {
	String nombre;
	LocalDate fnac;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechanac() {
		return fnac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fnac = fechanac;
	}

	public String obtenerEdad() {
		String age;
		Period edad = Period.between(this.fnac, LocalDate.now());
		age = String.format("%d años | %d meses | %d días", edad.getYears(), edad.getMonths(), edad.getDays());
		return age;
	}

	public String obtenerSigno() {
		String signo = "?";
		int dia = this.fnac.getDayOfMonth();
		int mes = this.fnac.getMonthValue();

		switch (mes) {
		case 1: //Enero
			if (dia > 21) {
				signo = "ACUARIO";
			} else {
				signo = "CAPRICORNIO";
			}
			break;
		case 2: //Febrero
			if (dia > 19) {
				signo = "PISCIS";
			} else {
				signo = "ACUARIO";
			}
			break;
		case 3: //Marzo
			if (dia > 20) {
				signo = "ARIES";
			} else {
				signo = "PISCIS";
			}
			break;
		case 4: //Abril
			if (dia > 20) {
				signo = "TAURO";
			} else {
				signo = "ARIES";
			}
			break;
		case 5: //Mayo
			if (dia > 21) {
				signo = "GEMINIS";
			} else {
				signo = "TAURO";
			}
			break;
		case 6: //Junio
			if (dia > 20) {
				signo = "CANCER";
			} else {
				signo = "GEMINIS";
			}
			break;
		case 7: //Julio
			if (dia > 22) {
				signo = "LEO";
			} else {
				signo = "CANCER";
			}
			break;
		case 8: //Agosto
			if (dia > 21) {
				signo = "VIRGO";
			} else {
				signo = "LEO";
			}
			break;
		case 9: //Septiembre
			if (dia > 22) {
				signo = "LIBRA";
			} else {
				signo = "VIRGO";
			}
			break;
		case 10: //Octubre
			if (dia > 22) {
				signo = "ESCORPION";
			} else {
				signo = "LIBRA";
			}
			break;
		case 11: //Noviembre
			if (dia > 21) {
				signo = "SAGITARIO";
			} else {
				signo = "ESCORPION";
			}
			break;
		case 12: //Diciembre
			if (dia > 21) {
				signo = "CAPRICORNIO";
			} else {
				signo = "SAGITARIO";
			}
			break;
		}
		return signo;
	}

	public String obtenerEstacion() {
		String estacion = "?";
		int dia = this.fnac.getDayOfMonth();
		int mes = this.fnac.getMonthValue();
		
		switch(mes){

		case 1: estacion = "Verano"; //Enero
		break;
		case 2: estacion = "Verano"; //Febrero
		break;
		case 3: //Marzo
			if (dia <= 20) {
				estacion = "Verano";
			}
			else
			{
				estacion = "Otoño";
			}
		break;
		case 4: estacion = "Otoño"; //Abril
		break;
		case 5: estacion = "Otoño"; //Mayo
		break;
		case 6: //Junio
			if (dia <= 20) {
				estacion = "Otoño";
			}
			else
			{
				estacion = "Invierno";
			}
		break;
		case 7: estacion = "Invierno"; //Julio
		break;
		case 8: estacion = "Invierno"; //Agosto
		break;
		case 9: //Septiembre
			if (dia <= 20) {
				estacion = "Invierno";
			}
			else {
				estacion = "Primavera";
			}
		break;
		case 10: estacion = "Primavera"; //Octubre
		break;
		case 11: estacion = "Primavera"; //Noviembre
		break;
		case 12: //Diciembre
			if (dia <= 20) {
				estacion = "Primavera";
			}
			else {
				estacion = "Verano";
			}
		break;
		}
		return estacion;
	}
}