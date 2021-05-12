package com.eduit;

//Creamos una abstraccion , que tiene el metod get tareas 
public interface Empleados {

	public String getTareas() ;
	
	//este metodo lo utilizaremos para la Inyeccion de dependencias
	public String getInforme() ;
}
