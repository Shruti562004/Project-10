package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.WaterDAOInt;
import com.rays.dto.WaterDTO;

@Service
@Transactional
public class WaterServiceImpl extends BaseServiceImpl<WaterDTO, WaterDAOInt> implements WaterServiceInt {

}