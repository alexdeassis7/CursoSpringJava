package com.eduit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUsoEmpleado {
	public static void main(String[] args) {

		// creamos objetos de tipo empleado
		JefeEmpleado e1 = new JefeEmpleado();

		// me creo una referencia a la abstraccion
	
		Empleados e2 = new JefeEmpleado();
		Empleados e3 = new SecretarioEmpleado();
		//el problema que se plantea aqui es que si quiero crear un objeto de 
		//un tipo diferente me veo obligado a modificar el codigo y definir una nueva clase .... por ejemplo si quiero crear un empleado etc
		//y si quiero dejar de usar una clase deberia elimnarla .
		//Empleados e4 = new DirectorEmpleado();
		
		

		// uso de los objetos creados
		System.out.println("e1:" + e1.getTareas());
		System.out.println("e2:" + e2.getTareas());
		
		System.out.println("e3:" + e3.getTareas());
		//System.out.println("e4:" + e4.getTareas());

		
		//ahora hacemos lo mismo pero con el contenedor Spring 
		
		//paso 1 cargar el xml 
		//primero creamos un contexto y le ponemos el nombre del archivo xml 
		ClassPathXmlApplicationContext contexto = new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		//paso 2 pedirle el beans al archivo xml  , pasandole el alias o id  y en segundo lugar le paso el nombre de la interface
		Empleados Juan = contexto.getBean("miEmpleado" ,Empleados.class);
		
		/*paso 3 utilizamos el objeto */
		System.out.println("utilizamos el bean " +Juan.getTareas());
		
		//DEMO INYECTION DEPENDENCIA: la ventaja de esto es que hoara podemos reutilizarlo en otra clases como en JefeEmpleado 
		System.out.println("utilizamos Inyeccion de dependencia Informe:" +Juan.getInforme());
		
		
		
		
		///paso 4 cerramos el contexto , liberamos los recursos
		contexto.close();
		
		//la utilidad de hacerlo asi , es que si en alguno otro momento necesito otro objeto , simplemente voy al xml y modifico el objeto que 
		// necesito que me genere por ejemplo : com.eduit.JefeEmpleado ,com.eduit.SecretarioEmpleado
		//de esta manera no precisamos modificar nada en el codigo solo en el xml 
		
		
		
		
		
		
	
		
		
		
	}
}
