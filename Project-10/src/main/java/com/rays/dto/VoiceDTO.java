package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "st_voice")
public class VoiceDTO  extends BaseDTO{

	
	@Column(name = "commandName", length = 50)
	private String commandName;
	
	@Column(name = "response", length = 50)
	private String response;
	
	@Column(name = "language", length = 50)
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
	public String getValue() {
	
		return commandName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "commandName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return commandName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Voice commandName";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Voice";
	}

}
