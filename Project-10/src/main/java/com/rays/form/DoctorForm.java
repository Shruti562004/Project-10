package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DoctorDTO;

public class DoctorForm  extends BaseForm{
	@NotEmpty(message = "name is required")
private String name;
	
	@NotEmpty(message = "specialization is required")
private String specialization;
	
	@NotNull(message = "experience is required")
private Long experience;
	
	
	@NotEmpty(message = "number is required")
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
public BaseDTO getDto() {

	DoctorDTO dto = initDTO(new DoctorDTO());
	dto.setName(name);
	dto.setSpecialization(specialization);
	dto.setExperience(experience);
	dto.setNumber(number);

	return dto;
}

}
