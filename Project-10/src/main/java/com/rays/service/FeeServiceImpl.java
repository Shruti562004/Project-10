package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FeeDAOInt;
import com.rays.dto.FeeDTO;

@Service
@Transactional
public class FeeServiceImpl extends BaseServiceImpl<FeeDTO, FeeDAOInt> implements FeeServiceInt {

}