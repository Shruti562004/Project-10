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
import com.rays.dto.FeeDTO;
import com.rays.form.FeeForm;
import com.rays.service.CollegeServiceInt;
import com.rays.service.FeeServiceInt;


@RestController
@RequestMapping(value = "Fee")
public class FeeCtl extends BaseCtl<FeeForm, FeeDTO, FeeServiceInt> {


	

}