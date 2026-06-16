package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CourierDTO;

public class CourierForm  extends BaseForm{


	
	@NotEmpty(message = "senderName is required")
	private String senderName;
	
	@NotEmpty(message = "receiverName is required")
	private String receiverName;
	
	@NotEmpty(message = "trackingNumber is required")
	private String trackingNumber;
	
	@NotEmpty(message = "deliveryStatus is required")
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
	public BaseDTO getDto() {

		CourierDTO dto = initDTO(new CourierDTO());
		dto.setSenderName(senderName);
		dto.setReceiverName(receiverName);
		dto.setTrackingNumber(trackingNumber);
		dto.setDeliveryStatus(deliveryStatus);

		return dto;
	}

}
