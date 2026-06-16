package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VoiceDAOInt;
import com.rays.dto.VoiceDTO;

@Service
@Transactional
public class VoiceServiceImpl extends BaseServiceImpl<VoiceDTO, VoiceDAOInt> implements VoiceServiceInt {

}