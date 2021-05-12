package com.aop.dao;

import org.springframework.stereotype.Component;

@Component("clienteVIPDAO")
public class ClienteVIPDAO {
	//esta clase posee un metodo insertaCliente() con el mismo nombre que la clase clienteDAO.
	public void insertaCliente() {
		// aqui estaria todo el codigo de la insercion en la base
		// Conexion cn = new Conexion.....etc
		System.out.println(" insertaCliente() Se inserto el cliente en la base de datos correctamente");
	}
	
	public void insertaClienteVIP() {
		// aqui estaria todo el codigo de la insercion en la base
		// Conexion cn = new Conexion.....etc
		System.out.println(" insertaClienteVIP() Se inserto el cliente VIP en la base de datos correctamente");
	}
	
	public void insertaClienteVIPConError() throws Exception {
		// aqui estaria todo el codigo de la insercion en la base
		// Conexion cn = new Conexion.....etc
		System.out.println(" insertaClienteVIPConError() Se inserto el cliente VIP en la base de datos correctamente");
		
		//forzamos una exception, esta podria simular quizas un bloqueo de una base ... un fichero tomado ... etc
	throw new Exception();
	}
}
