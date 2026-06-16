package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CourierDTO;

@Repository
public class CourierDAOImpl extends BaseDAOImpl<CourierDTO> implements CourierDAOInt {

	@Override
	public Class<CourierDTO> getDTOClass() {
		return CourierDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(CourierDTO dto, CriteriaBuilder builder, Root<CourierDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSenderName())) {

			whereCondition.add(builder.like(qRoot.get("senderName"), dto.getSenderName() + "%"));
		}

		if (!isEmptyString(dto.getReceiverName())) {

			whereCondition.add(builder.like(qRoot.get("receiverName"), dto.getReceiverName() + "%"));
		}

		if (!isEmptyString(dto.getTrackingNumber())) {

			whereCondition.add(builder.like(qRoot.get("trackingNumber"), dto.getTrackingNumber() + "%"));
		}

		if (!isEmptyString(dto.getDeliveryStatus())) {

			whereCondition.add(builder.like(qRoot.get("deliveryStatus"), dto.getDeliveryStatus() + "%"));
		}

		
		return whereCondition;
	}

}