package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.dao.ClienteDao;
import com.aop.dao.ClienteVIPDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		//aca nos falta levantar la configuracion 
		//le indicamos al constructor cual es la clase que posee la configuracion 
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		
		//obtengo el bean del contenedor de Spring
		ClienteDao  miCliente = contexto.getBean("clienteDAO",ClienteDao.class);
		
		//obtengo el bean del contenedor de Spring
		ClienteVIPDAO  miClienteVIP = contexto.getBean("clienteVIPDAO",ClienteVIPDAO.class);
				
		
		//llamamos la metodo  inserta cliente de la clase ClienteDao
		System.out.println("***************************** miCliente.insertaCliente() **********************************");
		miCliente.insertaCliente();//este es el nombre del metodo que debe coincidir con la anotacion @Before

		//llamamos la metodo  insertacliente de la clase ClienteVIPDAO
		System.out.println("***************************** miClienteVIP.insertaCliente() **********************************");
		miClienteVIP.insertaCliente();
		
		//llamamos la metodo  insertaClienteVIP de la clase ClienteVIPDAO
		System.out.println("***************************** miClienteVIP.insertaClienteVIP() **********************************");
		miClienteVIP.insertaClienteVIP();
				
		//llamamos la metodo  insertaClienteVIPConError() de la clase ClienteVIPDAO
		System.out.println("***************************** miClienteVIP.insertaClienteVIPConError() **********************************");
		try {
			miClienteVIP.insertaClienteVIPConError();
		} catch (Exception e) {
			System.out.println("Se capturo una exception al intentar agregar un cliente VIP");
		}
						
		
		//cerramos el contexto 
		contexto.close();

	}

}
