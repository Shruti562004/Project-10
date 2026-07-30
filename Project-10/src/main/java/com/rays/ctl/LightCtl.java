package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CollegeDTO;
import com.rays.dto.LightDTO;
import com.rays.form.LightForm;
import com.rays.service.CollegeServiceInt;
import com.rays.service.LightServiceInt;


@RestController
@RequestMapping(value = "Light")
public class LightCtl extends BaseCtl<LightForm, LightDTO, LightServiceInt> {


	

}