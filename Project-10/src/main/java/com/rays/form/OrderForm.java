package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm  extends BaseForm {
	
	@NotNull(message = "orderDate is required")
	private Date orderDate;
	
	@NotNull(message = "amount is required")
	private  Long amount ;
	
	@NotEmpty(message = "status is required")
	private String status;
	
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		OrderDTO dto = initDTO(new OrderDTO());
		dto.setOrderDate(orderDate);
		dto.setAmount(amount);
		dto.setStatus(status);
		

		return dto;
	}
	
}
