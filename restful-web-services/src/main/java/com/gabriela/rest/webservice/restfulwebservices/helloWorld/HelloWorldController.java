package com.gabriela.rest.webservice.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//anotacion de Sprinf MVC que puede manejar solicitudes dirigidas
@RestController
public class HelloWorldController {
	
	//anotacion para el mapero de la solicitud y se defne el metodo de la solicitud q se quiere usar
//@RequestMapping(method= RequestMethod.GET, path	="/helloWorld") 
	//Existe esta forma donde no indicamos el metodo
	@GetMapping(path ="/hello-world")
	public String helloWorld() {
		
		return "Hola 4";
		
	}
	
	
	@GetMapping(path ="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hola Mundo desde Bean");
		
	}
	
	//variables de ruta
	@GetMapping(path ="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hola Mundo desde Bean, %s", name));
		
	}


}
