package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto4 {

	private int num;
	public String par;
	

	public Punto4() {
	}
	
	public Punto4(int num, String par) {
		this.num = num;
		this.par = par;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getPar() {
		return par;
	}

	public void setPar(String par) {
		this.par = par;
	}

	public String esPar(int aux) {
		 if (aux % 2 == 0) {
		        return "Par";
		    } else {
		        return "Impar";
		    }
	    
	}
}