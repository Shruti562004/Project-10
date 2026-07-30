package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dao.FeeDAOInt;
import com.rays.dto.FeeDTO;

@Repository
public class FeeDAOImpl extends BaseDAOImpl<FeeDTO> implements FeeDAOInt {

	@Override
	public Class<FeeDTO> getDTOClass() {
		return FeeDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(FeeDTO dto, CriteriaBuilder builder, Root<FeeDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		
		
		if (isNotNull(dto.getAmount())) {
            whereCondition.add(builder.equal(qRoot.get("amount"), dto.getAmount()));
        }

		if (isNotNull(dto.getPayDate())) {
            whereCondition.add(builder.equal(qRoot.get("payDate"), dto.getPayDate()));
        }
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		
		return whereCondition;
	}

}