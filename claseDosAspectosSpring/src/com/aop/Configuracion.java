package com.aop;
//clase que configura para que spring sepa que se trata del archivo de un conf y
//que vamos a usar AOP , aqui tambien le vamos a indicar donde buscar las clases con los aspectos 

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //indicamos que es un archivo de configuraciones 
@EnableAspectJAutoProxy//habilitamos la configuracion de programacion orientada a aspectos 
@ComponentScan("com.aop")//le indica a donde buscar los aspectos , esto busca en el paquete RAIZ y los paquetes subyacentes
public class Configuracion {
		//esta clase no necesita llevar codigo en su interior 
}
