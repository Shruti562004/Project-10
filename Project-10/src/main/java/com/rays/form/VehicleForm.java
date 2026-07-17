package com.rays.form;


import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VehicleDTO;

public class VehicleForm extends BaseForm {




	@NotEmpty(message = "number is required")
	private String number;
	


	@NotEmpty(message = "type is required")
	private String type;
	

	@NotEmpty(message = "model is required")
	private String model;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public BaseDTO getDto() {

		VehicleDTO dto = initDTO(new VehicleDTO());
		dto.setNumber(number);
		dto.setType(type);
		dto.setModel(model);
		

		return dto;
	}
}
