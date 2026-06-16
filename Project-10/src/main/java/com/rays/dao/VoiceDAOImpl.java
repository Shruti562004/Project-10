package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VoiceDTO;

@Repository
public class VoiceDAOImpl extends BaseDAOImpl<VoiceDTO> implements VoiceDAOInt {

	@Override
	public Class<VoiceDTO> getDTOClass() {
		return VoiceDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(VoiceDTO dto, CriteriaBuilder builder, Root<VoiceDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCommandName())) {

			whereCondition.add(builder.like(qRoot.get("commandName"), dto.getCommandName() + "%"));
		}

		if (!isEmptyString(dto.getResponse())) {

			whereCondition.add(builder.like(qRoot.get("response;"), dto.getResponse() + "%"));
		}

		if (!isEmptyString(dto.getLanguage())) {

			whereCondition.add(builder.like(qRoot.get(" language"), dto.getLanguage() + "%"));
		}

	
		
		return whereCondition;
	}

}