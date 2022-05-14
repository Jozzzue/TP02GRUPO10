package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.edm.model.Punto4;


@Component
public class NumerosPunto4 {
	private List<Punto4> numbers = new ArrayList<>();
	public NumerosPunto4() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Punto4> getNumbers(){
		return numbers;
	}
	
	public void setNumbers(List<Punto4> numbers) {
		this.numbers = numbers;
	}
}
