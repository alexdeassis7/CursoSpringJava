package com.eduit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCicloDeVidaBeans {

	public static void main(String[] args) {
		//cargamos el xml de config
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//solicito el beans a spring 
		Empleados director = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		
		//utilizo el beans
		System.out.println(director.getInforme());
		
		
		//cerramos el context y liberamos recursos
		contexto.close();
		
		
	}

}
