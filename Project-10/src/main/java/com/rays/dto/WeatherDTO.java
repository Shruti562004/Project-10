package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_weather")
public class WeatherDTO  extends BaseDTO{


	@Column(name = "code", length = 50)
	private String code;
	

	@Column(name = "name", length = 50)
	private String name;
	

	@Column(name = "temp", length = 50)
	
	private  Long temp;
	

	@Column(name = "status", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "name";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Weather Name";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Weather";
	}
	
}
