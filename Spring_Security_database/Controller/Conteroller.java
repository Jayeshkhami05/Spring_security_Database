package com.Rutuja.Spring_Security_database.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rutuja.Spring_Security_database.Entity.Entityuser;
import com.Rutuja.Spring_Security_database.repositry.Repo;

@RestController
@RequestMapping("Database")
public class Conteroller {

	@Autowired
	private Repo repo;
	
	@PostMapping("/saveuser")
	public Entityuser saveuser(@RequestBody Entityuser entityuser)
	{
		return repo.save(entityuser);
	}
	@GetMapping("/User")
	public String Alluser() {
		return "I am API of Alluser";
	}
	
	@GetMapping("/Admin")
	public String Admin() {
		return "I am API of Admin";
	}
	
	@GetMapping("/Public")
	public String Public() {
		return "I am API of Public";
	}
}
