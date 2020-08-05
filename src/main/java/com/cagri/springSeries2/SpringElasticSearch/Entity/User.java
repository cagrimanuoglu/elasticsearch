package com.cagri.springSeries2.SpringElasticSearch.Entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(indexName = "users",type = "user")
public class User {
	
	
	@Id
	private String id;
	
	@Field(name = "name",type = FieldType.Text)
	private String name;
	
	@Field(name = "surname",type = FieldType.Text)
	private String surname;
	
	@Field(name = "address",type = FieldType.Text)
	private String address;
	/*
	@Field(name = "birthdate",type = FieldType.Date)
	private Date birthdate; */

	public User()
	{
		
	}
	
	
	public User(String id, String name, String surname, String address) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		//this.birthdate = birthdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
/*
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	} */
	
	
	
	
	
	
}
