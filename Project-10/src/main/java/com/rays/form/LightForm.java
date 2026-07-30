package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FacultyDTO;
import com.rays.dto.LightDTO;

public class LightForm extends BaseForm {
	@NotEmpty(message = "code is required")
	private String code;

	@NotEmpty(message = "Name is required")
	private String name;

	@NotNull(message = "level is required")
	private Long level;

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
	    public LightDTO getDto() {

	  
	        LightDTO dto = initDTO(new LightDTO());
	  
	        dto.setName(name);
	        dto.setCode(code);
	        dto.setLevel(level);
	        dto.setStatus(status);

	        return dto;
	    }

}
