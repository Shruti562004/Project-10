package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_courier")
public class CourierDTO extends BaseDTO  {

	@Column(name = "senderName", length = 50)
	private String senderName;
	
	@Column(name = "receiverName", length = 50)
	private String receiverName;
	
	@Column(name = "trackingNumber", length = 50)
	private String trackingNumber;
	
	@Column(name = "deliveryStatus", length = 50)
	private String deliveryStatus;
	
	
	
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return senderName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "senderName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return senderName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Courier Name";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Courier";
	}

}
