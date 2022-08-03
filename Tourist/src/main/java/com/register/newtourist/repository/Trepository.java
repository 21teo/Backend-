package com.register.newtourist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.newtourist.entity.Tourist;

@Repository
public interface Trepository extends JpaRepository<Tourist, Integer>{


}
