package ar.edu.unju.edm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Alumno;
import ar.edu.unju.edm.until.ListaAlumnos;



@Controller
public class Punto8Controller {
	
	@Autowired
	ListaAlumnos estudiantes;
	
    @GetMapping("/mostrarPunto8")
	public ModelAndView getListadoAlumnos() {
    //cargar datos 
    	double good_grades[]= {8.4 , 10 , 3.50 , 5 , 6};
    	double bad_grades[]= {6.4 , 5 , 3.50 , 5 , 1};
    	
    	Alumno student1 = new Alumno("Juan","Perez",1,bad_grades);
    	Alumno student2 = new Alumno("Carlos","Santamaria",2,good_grades);
    	Alumno student3 = new Alumno("Hector","Portal",3,bad_grades);
    	Alumno student4 = new Alumno("Julio","Hernandez",4,good_grades);
    	

    //se ingresan alumnos
    	estudiantes.getListado().add(student1);
    	estudiantes.getListado().add(student2);
    	estudiantes.getListado().add(student3);
    	estudiantes.getListado().add(student4);
   
    //enviar resultados
    	ModelAndView modelView = new ModelAndView("TP02-Punto8");
    	modelView.addObject("Punto8",estudiantes.getListado());
        return modelView;
    }
    
    @GetMapping("/mostrarAprobados")
    public ModelAndView getApprovedStudents(){
        //cargar datos 
        	ListaAlumnos approved = new ListaAlumnos();
        	
        //inserta alumnos aprobados a un arraylist auxiliar	
        	for (int x=0; x< estudiantes.getListado().size();x++) {
        		if (estudiantes.getListado().get(x).calcularPromedio() >= 6)
        			approved.getListado().add(estudiantes.getListado().get(x));
        	}
        	
       
        //enviar resultados
        	ModelAndView modelView = new ModelAndView("TP02-Punto8_1");
        	modelView.addObject("Punto8_1",approved.getListado());
            return modelView;
        }
    
    @GetMapping("/borrarAlumno")
    public ModelAndView deleteStudent(@RequestParam (name = "libreta") int report_card){
        
    	//eliminar alumno 
    	for (int x=0; x< estudiantes.getListado().size();x++) {
    		if (estudiantes.getListado().get(x).getLibretaUni() == report_card)
    			estudiantes.getListado().remove(x);
    	   }
       
        //actualizar resultados
        	ModelAndView modelView = new ModelAndView("TP02-Punto8_2");
        	modelView.addObject("Punto8_2",estudiantes.getListado());
            return modelView;
        }
    
    
}
