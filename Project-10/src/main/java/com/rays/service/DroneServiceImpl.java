package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DroneDAOInt;
import com.rays.dto.DroneDTO;

@Service
@Transactional
public class DroneServiceImpl extends BaseServiceImpl<DroneDTO, DroneDAOInt> implements DroneServiceInt {

}