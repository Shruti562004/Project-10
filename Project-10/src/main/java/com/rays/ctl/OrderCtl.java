package com.rays.ctl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.OrderDTO;
import com.rays.form.OrderForm;
import com.rays.service.OrderServiceInt;

@RestController
@RequestMapping(value = "Order")



public class OrderCtl extends BaseCtl<OrderForm, OrderDTO, OrderServiceInt> {
	

}