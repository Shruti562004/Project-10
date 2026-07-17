package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DroneDTO;

public class DroneForm extends BaseForm {
	@NotEmpty(message = "code is required")
	private String code;

	@NotEmpty(message = "name is required")
	private String name;
	

	@NotEmpty(message = "zone is required")
	private String zone;
	

	@NotEmpty(message = "status is required")
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


	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	@Override
	public BaseDTO getDto() {

		DroneDTO dto = initDTO(new DroneDTO());
		dto.setCode(code);
		dto.setName(name);
		dto.setZone(zone);
		dto.setStatus(status);

		return dto;
	}

}
