package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_vehicle")
public class VehicleDTO extends BaseDTO {

	@Column(name = "number", length = 50)
	private String number;
	

	@Column(name = "type", length = 50)
	private String type;
	

	@Column(name = "model", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return number;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "number";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return number;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Vehicle Number";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Vehicle";
	}

}
