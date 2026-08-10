package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_order")
public class OrderDTO  extends BaseDTO{
	@Column(name = "orderDate")
	private Date orderDate;
	
	@Column(name = "amount")
	private  Long amount ;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return status;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "status";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return status;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Order Amount";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Order";
	}

}
