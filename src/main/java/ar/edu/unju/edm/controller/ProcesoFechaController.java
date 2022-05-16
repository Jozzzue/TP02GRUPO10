package ar.edu.unju.edm.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.ProcesoFecha;

@Controller
public class ProcesoFechaController {

	@GetMapping("mostrarPunto2")
	public ModelAndView getProcesoFecha(){
	 //cargar datos
		ProcesoFecha pf1 = new ProcesoFecha(LocalDate.of(2000,4,15),LocalDate.now());
		
	//Proceso
		String result;
		if(pf1.contarTiempoTranscurrido().isZero()==true)
			result = "Fecha 1 debe ser antes que Fecha 2";
		else
		   result = pf1.contarTiempoTranscurrido().toString();
		

	//enviar resultados
		ModelAndView modelView = new ModelAndView("TP02-Punto2");
		modelView.addObject("Punto2", pf1);
		modelView.addObject("Punto2_1", result);
		return modelView;
	}
	
	@GetMapping("mostrarPunto2_b2_b4")
	public ModelAndView getProcesoFecha1(){
	 //cargar datos
		ProcesoFecha pf2 = new ProcesoFecha(LocalTime.of(5, 30, 0),LocalTime.of(3, 20, 0));
		
	
		
	//Proceso b.2
	     String time1=pf2.getTime1().toString(), time2=pf2.getTime2().toString();
	     LocalTime aux = pf2.getTime1().plusHours(5);
		pf2.setTime1(aux);
		aux = pf2.getTime2().minusMinutes(20);
		pf2.setTime2(aux);
	
    //Proceso b.4
		pf2.setFecha1(LocalDate.of(2000,4,15));
		pf2.setFecha2(LocalDate.now());
		pf2.setDateTime1(LocalDateTime.of(pf2.getFecha1(), pf2.getTime1()));
		pf2.setDateTime2(LocalDateTime.of(pf2.getFecha2(), pf2.getTime2()));
		
		
	//enviar resultados
		ModelAndView modelView = new ModelAndView("TP02-Punto2_1");
		modelView.addObject("Punto2b2_1", time1);
		modelView.addObject("Punto2b2_2", time2);
		modelView.addObject("Punto2b2", pf2);
		
		return modelView;
	}
	
	@GetMapping("mostrarPunto2b5")
	public ModelAndView getProcesoFecha2(){

	 //cargar datos
		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(2003,8,20),LocalDate.now());
		
	
		
	//Proceso b.5
	 int yy, dd, mm;
	 yy = pf4.contarTiempoTranscurrido().getYears();
	 dd = pf4.contarTiempoTranscurrido().getDays();	
	 mm = pf4.contarTiempoTranscurrido().getMonths();
	 String date1,date2, result;
	 date1 = pf4.formatearFecha(pf4.getFecha1());
	 date2 = pf4.formatearFecha(pf4.getFecha2());
	 result = "Han transcurrido "+yy+" años, "+mm+" meses, "+dd+" dias, desde la fecha "+date1+" hasta la fecha "+date2;
		
	//enviar resultados
		ModelAndView modelView = new ModelAndView("TP02-Punto2_2");

		modelView.addObject("Punto2b5", pf4);
		modelView.addObject("Punto2b5_1", result);
		
		return modelView;
	}
	
	@GetMapping("mostrarPunto2b6")
	public ModelAndView getProcesoFecha3(@RequestParam (name = "dat1") String dat1, @RequestParam (name = "dat2") String dat2){

	 //cargar datos
		ProcesoFecha pf5 = new ProcesoFecha();
	
	//Proceso b.6
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		LocalDate aux = LocalDate.parse(dat1, formatter);
		pf5.setFecha1(aux);
		aux=LocalDate.parse(dat2, formatter);
		pf5.setFecha2(aux);
		
		pf5.setFecha1(pf5.getFecha1().plusDays(365));
		pf5.setFecha2(pf5.getFecha2().minusMonths(6));
		
		
	//enviar resultados
		ModelAndView modelView = new ModelAndView("TP02-Punto2_3");

		modelView.addObject("Punto2b6", pf5);
		modelView.addObject("d1", dat1);
		modelView.addObject("d2", dat2);
		return modelView;
	}
	
}
