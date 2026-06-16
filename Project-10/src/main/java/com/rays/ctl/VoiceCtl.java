package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.VoiceDTO;
import com.rays.form.VoiceForm;
import com.rays.service.VoiceServiceInt;

@RestController
@RequestMapping(value = "Voice")
public class VoiceCtl extends BaseCtl<VoiceForm, VoiceDTO, VoiceServiceInt> {

}