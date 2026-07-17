package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.WaterDTO;
import com.rays.form.WaterForm;
import com.rays.service.WaterServiceInt;

@RestController
@RequestMapping(value = "Water")
public class WaterCtl extends BaseCtl<WaterForm, WaterDTO, WaterServiceInt> {

}