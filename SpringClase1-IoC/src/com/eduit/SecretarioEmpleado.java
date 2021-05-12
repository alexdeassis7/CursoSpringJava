package com.eduit;

public class SecretarioEmpleado implements Empleados {

	
	private CreacionInformes informeNuevo;
	
	@Override
	public String getTareas() {
		return "Soy un secretario y me gusta obedecer ordenes de mis susperirores ";
	}
	

	@Override
	public String getInforme() {
			return " ";
	}

	//INYECCION DE DEPENDENCIAS MEDIANTE EL SETTERS
	//GENERAMOS UN SETTER PARA PODER USAR la INyeccion de dependencias 
	///mediante el tag "property"
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}
