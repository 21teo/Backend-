package com.register.newtourist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tourists")
public class Tourist {
	
		
		@Id
		private int id;
		
		@Column(name="first_name")
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		@Column(name="place")
		private String place;
		
		@Column(name="gender")
		private String gender;
		
		@Column(name="age")
		private int age;
		
		@Column(name="days")
		private int days;
		
		public Tourist() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Tourist(int id, String firstName, String lastName, String place, String gender, int age, int days) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.place = place;
			this.gender = gender;
			this.age = age;
			this.days = days;
		}

		public long getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getDays() {
			return days;
		}

		public void setDays(int days) {
			this.days = days;
		}

		
		
		
}