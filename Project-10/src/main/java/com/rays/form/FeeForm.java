package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FeeDTO;

public class FeeForm  extends BaseForm{

	
	@NotEmpty(message = "name is required")
	private String name;
	
	
	@NotNull(message = "amount is required")
	private Long amount;
	
	
	@NotNull(message = "payDate is required")
	private Date payDate;
	
	
	@NotEmpty(message = "status is required")
	private String status;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		FeeDTO dto = initDTO(new FeeDTO());
		dto.setName(name);
		dto.setAmount(amount);
		dto.setPayDate(payDate);
		dto.setStatus(status);
	

		return dto;
	}
}
