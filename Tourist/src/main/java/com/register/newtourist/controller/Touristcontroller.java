package com.register.newtourist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.newtourist.entity.Tourist;
import com.register.newtourist.service.Tservice;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/tourist")
public class Touristcontroller {
	@Autowired
	private Tservice service;
	
	@PostMapping("/add")
	public Tourist addTourist(@RequestBody Tourist tourist){
		return service.saveTourist(tourist);
	}
	
	@GetMapping("/get")
	public List<Tourist>getAllTourist(){
		return service.getTourists();
	}

}