package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.WaterDTO;

public class WaterForm extends BaseForm {

	@NotEmpty(message = "code is required")
	private String code;

	@NotEmpty(message = "location is required")
	private String location;

	@NotNull(message="level is required")
	private Long level;

	@NotEmpty(message = "status is required")
	private String status;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		WaterDTO dto = initDTO(new WaterDTO());
		dto.setCode(code);
		dto.setLocation(location);
		dto.setLevel(level);
		dto.setStatus(status);

		return dto;
	}

}
