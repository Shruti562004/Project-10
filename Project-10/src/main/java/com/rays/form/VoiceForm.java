package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VoiceDTO;

public class VoiceForm extends BaseForm {


	@NotEmpty(message = "commandName is required")
	private String commandName;
	

	@NotEmpty(message = "response is required")
	private String response;
	

	@NotEmpty(message = "commandName is required")
	private String language;

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public BaseDTO getDto() {

		VoiceDTO dto = initDTO(new VoiceDTO());
		dto.setCommandName(commandName);
		dto.setResponse(response);
		dto.setLanguage(language);
		

		return dto;
	}
}
