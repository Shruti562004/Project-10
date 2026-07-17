package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.WaterDTO;

@Repository
public class WaterDAOImpl extends BaseDAOImpl<WaterDTO> implements WaterDAOInt {

	@Override
	public Class<WaterDTO> getDTOClass() {
		return WaterDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(WaterDTO dto, CriteriaBuilder builder, Root<WaterDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCode())) {

			whereCondition.add(builder.like(qRoot.get("code"), dto.getCode() + "%"));
		}

		if (!isEmptyString(dto.getLocation())) {

			whereCondition.add(builder.like(qRoot.get("location"), dto.getLocation() + "%"));
		}

		if (isNotNull(dto.getLevel())) {
            whereCondition.add(builder.equal(qRoot.get("level"), dto.getLevel()));
        }


		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		
		return whereCondition;
	}

}