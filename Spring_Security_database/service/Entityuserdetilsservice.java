package com.Rutuja.Spring_Security_database.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Rutuja.Spring_Security_database.Entity.Entityuser;
import com.Rutuja.Spring_Security_database.repositry.Repo;

@Service
public class Entityuserdetilsservice implements UserDetailsService{

	@Autowired
	private Repo repo;
	
	@Autowired
	private PasswordEncoder passe;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Entityuser> optional=repo.findByName(username);
		if(optional.isPresent()) {
			UserDetails userDetails1= User.builder().username(optional.get().getName()).password(passe.encode(optional.get().getPass())).roles(optional.get().getRole()).build();
			return userDetails1;
		}
		return null;
	}

	
}
