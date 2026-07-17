package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_drone")
public class DroneDTO  extends BaseDTO{
	
	

	@Column(name = "code", length = 50)
	private String code;

	@Column(name = "name", length = 50)
	private String name;
	

	@Column(name = "zone", length = 50)
	private String zone;
	

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
	public String getUniqueKey() {
		return "name";
	}

	@Override
	public String getUniqueValue() {
		return name;
	}

	@Override
	public String getLabel() {
		return "Drone Name";
	}
	
	@Override
	public String getTableName() {
		return "Drone";
	}

	@Override
	public String getValue() {
		return name;
	}
	
}
