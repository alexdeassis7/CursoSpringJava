package com.aop.dao;

import org.springframework.stereotype.Component;

//Esta clase debe funcionar a modo componente por eso agregamos la anotacion @Component 
@Component("clienteDAO")
public class ClienteDao {

	//antes de ejecutar este metodo por detras y de forma automatica se deberia ejecutar nuestro aspecto
	//que valida/comprueba que el usuario esta correctamente logueado y que su rol en el 
	//requerido para ejecutar la accion de insertar un Cliente 
	public void insertaCliente() {
		// aqui estaria todo el codigo de la insercion en la base
		//Conexion cn = new Conexion.....etc 
		System.out.println("Se inserto el cliente en la base de datos correctamente");
	}
}
