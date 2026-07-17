package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LightDTO;

public class LightForm  extends BaseForm{
	@NotEmpty(message = "code is required")
	private  String code;
	

	@NotEmpty(message = "Name is required")
	private String name;
	

	@NotEmpty(message = "level is required")
	private long level;
	

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

	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
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

		LightDTO dto = initDTO(new LightDTO());

		dto.setCode(code);
		dto.setName(name);
		dto.setLevel(level);
		dto.setStatus(status);

		return dto;
	}

}
