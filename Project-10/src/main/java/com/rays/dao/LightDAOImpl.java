package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LightDTO;

@Repository
public class LightDAOImpl extends BaseDAOImpl<LightDTO> implements LightDAOInt {

	@Override
	public Class<LightDTO> getDTOClass() {
		return LightDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LightDTO dto, CriteriaBuilder builder, Root<LightDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCode())) {

			whereCondition.add(builder.like(qRoot.get("code"), dto.getCode() + "%"));
		}

		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
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