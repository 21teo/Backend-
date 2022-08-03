package com.register.newtourist;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.register.newtourist.entity.Tourist;
import com.register.newtourist.repository.Trepository;



@SpringBootTest
class TouristApplicationTests {
	
	@Autowired
	Trepository tRepo;

	@Test
	public void testCreate() {
		Tourist t = new Tourist();
		t.setId(1253);
		t.setFirstName("Mohit");
		t.setLastName("Gupta");
		t.setPlace("Delhi");
		t.setGender("Male");
		t.setAge(25);
		t.setDays(5);
		tRepo.save(t);
		assertNotNull(tRepo.findById(1253).get());
		
	}
	
	@Test
	public void testReadAll() {
		List<Tourist> list = tRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

}
