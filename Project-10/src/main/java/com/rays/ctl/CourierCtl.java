package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.CourierDTO;
import com.rays.form.CourierForm;
import com.rays.service.CourierServiceInt;

@RestController
@RequestMapping(value = "Courier")
public class CourierCtl extends BaseCtl<CourierForm, CourierDTO, CourierServiceInt> {

}