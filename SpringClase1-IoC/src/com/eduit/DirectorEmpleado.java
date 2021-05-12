package com.eduit;

public class DirectorEmpleado implements Empleados {

	// Creacion de campo Tipo CreacionInforme(Interface) , para la inyeccion de
	// dependecia
	private CreacionInformes informeNuevo;

	// Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {

		return "Gestiono la nomina de todos los empleados ";
	}

	@Override
	public String getInforme() {
		// utlizamos el metodo get informe de la interface
		return "informe creado por el director  : " + informeNuevo.getInforme();
	}

	// creamos lo metoddos init : ejecutar tareas antes de que el bean este
	// disponible
	// los metodos no tienen por que se void siempre pero la mayoria de la veces lo
	// seran
	// y tampoco tienen por que llamarse initi o destroyt ,pueden tener cualquier
	// nombre valido !
	public void metodoInicial() {
		//ACA VA EL CODIGO QUE QUEREMOS EJECUTAR ANTES QUE EL BEAN ESTE DISPONIBLE 
		System.out.println("dentro del metodo init aca van las tareas a ejecutar antes que el bean este listo  ");
	}
	
	//creamos el metodo destroy para ejecutar tareas despues de que el bean ya fue utilizado 
	public void metodoFinal() {
		//aca va el codigo que queremos ejecutar luego de que el bean "muera"
		
		System.out.println("dentro del metodo DESTROY aca van las tarea a despues de que el bean muera!");
	}
	
	
	

}
