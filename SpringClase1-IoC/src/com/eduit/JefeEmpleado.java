package com.eduit;


//Esta clase solo tendra un Gettters
public class JefeEmpleado implements Empleados {
	
	//sobreescribimos el metodo de la interface
	public String getTareas() {
		return "Soy el jefe , y encargado de todos , asi que o me obedecen o renuncian"; 
	}

	@Override
	public String getInforme() {
			return " ";
	}

}
