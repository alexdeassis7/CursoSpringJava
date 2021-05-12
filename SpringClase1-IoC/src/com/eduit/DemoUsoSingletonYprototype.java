package com.eduit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUsoSingletonYprototype {

	public static void main(String[] args) {
		//vargamos el xml de configuracion 
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		//peticion de beans al containner de Spring 
		//pedimos dos beans del tipo secretario empleado 
		//como por defecto Spring trabaja con Singleton , esto quiere decir 
		//que los dos beans deberian apuntar  a la misma direccion de memoria 
				
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		//comprobamos que ambos objetos apuntan a la misma Direccion de memoria 
		System.out.println(maria);
		System.out.println(pedro);
		
		if(maria == pedro) {
			System.out.println("apuntan al mismo objeto ");
		}else {
			System.out.println("no son los mismo objetos ");
		}
		
		
		
	}

}
