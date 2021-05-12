package com.aop.aspectos;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.test.context.transaction.AfterTransaction;

//esta clase sera nuestro aspecto , con la funcionalidad transversal que tiene que ejecutarse siempre 
// se invoque al metodo insertaCliente()

@Component//indicamos que es un component 
@Aspect //indicamos que esta clase es un aspecto 
public class LoginConAspecto {

	//utilizamos before para que se ejecute ANTES del metodo insertaCliente,
	//@Before("execution(public void insertaCliente())")
	
	//que pasa si tengo mas de un metodo con el nombre insertaCliente() en varias clases?? , hagamos la prueba con 
	//la clase clienteVIPDAO ,el Aspecto se ejecutara siempre por que no hace distinciones de nombre de clases
	
	//que pasa si solo se quiere que se ejecute el aspecto para clientes VIPS ? como lo hacemos?
	//lo realizamos utilizando los "PointCutExpression" , para ellos simplemente debemos incluir la ruta en la anotation Before
	//por ejemplo: @Before("execution(public void com.aop.dao.ClienteVIPDAO.insertaCliente())")
	
	//y que pasa si quiero que se ejecute para todos los metodos que se llamen inserta..XXXXXXXX*()
	//lo que debemos realizar es estos casos es crear un pointCut de la siguienteManera
	//ej : 	@Before("execution(public void inserta*())")

	@Before("execution(public void inserta*())")
	public void antesInsertaCliente() {
		System.out.println("Se comprobo y el usuario esta Logeado");
		System.out.println("el Rol del usuario logeado es el correcto y puede INSERTAR en la base de datos");
	}
	
	
	
	
	//esta anotacion ejecuta un advice  despues de la ejecucion del pointCut especificado 
	//, siempre que el metodo del pointCut retorne de forma "normal" osea sin lanzar una exception
	@AfterReturning("execution(public void insertaCliente())")
	public void despuesDeInsertarCliente() {
		System.out.println("este metodo se ejecuta despues de que finalice el/los metodo/s insertaCliente()");
	
	}
	
  
  //este metodo se ejecuta despues de que finalice el/los metodo/s insertaClienteVIPConError() siempre y cuando el mismo retorne una exception!
	@AfterThrowing(pointcut = "execution(public * insertaClienteVIPConError())", throwing = "daoe")
	public void despuesDeInsertarCliente(Exception daoe) {
		System.out.println("este metodo se ejecuta despues de que finalice el/los metodo/s insertaCliente()");
	
	}
	
	
	
	
	
	
}
