package com.gabriela.rest.webservice.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService serviceUser;
	
	//RECUPERAR TOODOS LOS USUARIO
	@GetMapping("/users")
	public List<User> recuperarAllUsers(){
		return  serviceUser.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User recuperarUser(@PathVariable int id) {
		return serviceUser.findOne(id);
	}
	
	// PARA LA CREACION DE UN NUEVO USUARIO SE LE DIC AL MAPEO con @RequestBoby QUE ES EL CUERPO 
	//DE SU SOLICITUD COMO PARAMETRO
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		User saveUser =serviceUser.save(user);
	}

}
