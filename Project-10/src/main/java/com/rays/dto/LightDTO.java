package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_light")


public class LightDTO  extends BaseDTO{
	
	@Column(name = "code", length = 50)
	private  String code;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "level")
	private long level;
	
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
	public String getValue() {
		// TODO Auto-generated method stub
		return code;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "code";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return code;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Light Code";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Light";
	}


}
