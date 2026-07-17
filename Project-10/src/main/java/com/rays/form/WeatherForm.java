package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.WeatherDTO;

public class WeatherForm  extends BaseForm{

	@NotEmpty(message = "code is required")
	private String code;
	

	@NotEmpty(message = "name is required")
	private String name;
	

	@NotNull(message = "temp is required")
	
	private  Long temp;
	

	@NotEmpty(message = "statuss is required")
	private String status;


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getTemp() {
		return temp;
	}


	public void setTemp(Long temp) {
		this.temp = temp;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	@Override
	public BaseDTO getDto() {

		WeatherDTO dto = initDTO(new WeatherDTO());
		dto.setCode(code);
		dto.setName(name);
		dto.setTemp(temp);
		dto.setStatus(status);
		

		return dto;
	}

}
