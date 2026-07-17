package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_water")
public class WaterDTO extends BaseDTO {

	@Column(name = "code", length = 50)
	private String code;

	@Column(name = "location", length = 50)
	private String location;

	@Column(name = "level")
	private Long level;

	@Column(name = "status")
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

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public void setLocation(String location) {
		this.location = location;
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
		return location;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "location";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Water Code";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Water";
	}

}
