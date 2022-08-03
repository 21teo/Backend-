package com.register.newtourist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.register.newtourist.entity.Tourist;
import com.register.newtourist.repository.Trepository;

@Service
public class Tservice {


	@Autowired
	private Trepository repository;
	
	

	public List<Tourist> getTourists() {
		List<Tourist> tourist = repository.findAll(Sort.by(Sort.Direction.DESC,"firstName"));
		return tourist;
	}

	public Tourist saveTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		return repository.save(tourist);
	}

	
	
}