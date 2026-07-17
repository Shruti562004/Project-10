package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DroneDTO;

@Repository
public class DroneDAOImpl extends BaseDAOImpl<DroneDTO> implements DroneDAOInt {

	@Override
	public Class<DroneDTO> getDTOClass() {
		return DroneDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(DroneDTO dto, CriteriaBuilder builder, Root<DroneDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getCode())) {

			whereCondition.add(builder.like(qRoot.get("code"), dto.getCode() + "%"));
		}

		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (!isEmptyString(dto.getZone())) {

			whereCondition.add(builder.like(qRoot.get("zone"), dto.getZone() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}

}