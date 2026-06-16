package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CourierDAOInt;
import com.rays.dto.CourierDTO;

@Service
@Transactional
public class CourierServiceImpl extends BaseServiceImpl<CourierDTO, CourierDAOInt> implements CourierServiceInt {

}