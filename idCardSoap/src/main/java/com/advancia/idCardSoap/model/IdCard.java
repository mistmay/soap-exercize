package com.advancia.idCardSoap.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IdCard implements Serializable {
	private static final long serialVersionUID = -7846083786214239318L;

	private String name;
	private String surname;
	private Integer age;
	private Date birthDate;
	private String photo;

	public IdCard() {
	}

	public IdCard(String name, String surname, Date birthDate, String photo) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.age = calculateAge(birthDate);
		this.photo = photo;
	}
	
	private Integer calculateAge(Date birthDate) {
		Date currentDate = new Date();
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");                           
	    Integer d1 = Integer.parseInt(formatter.format(birthDate));                            
	    Integer d2 = Integer.parseInt(formatter.format(currentDate)); 
	    return (d2 - d1) / 10000;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
