package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "st_doctor")
public class DoctorDTO  extends BaseDTO{
	
	@Column(name = "name", length = 50)
private String name;
	
	@Column(name = "specialization", length = 50)
private String specialization;
	
	@Column(name = "experience")
private Long experience;
	@Column(name = "number", length = 50)
private String number;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public Long getExperience() {
	return experience;
}
public void setExperience(Long experience) {
	this.experience = experience;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}


@Override
public String getUniqueKey() {
	return "specialization";
}

@Override
public String getUniqueValue() {
	return specialization;
}

@Override
public String getLabel() {
	return "Doctor specialization";
}

@Override
public String getTableName() {
	return "Docter";
}

@Override
public String getValue() {
	return specialization;
}
}
