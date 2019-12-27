package com.chicagomural.mural.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chicagomural.mural.service.MuralService;
import com.chicagomural.mural.view.MuralDetailsView;

@RestController
@RequestMapping("/mural")
public class MuralController {
	
	private MuralService muralService;
	@Autowired
	public MuralController(MuralService muralService) {
		this.muralService = muralService;
	}

	@GetMapping("/details/{muralRegestrationId}")
	public MuralDetailsView getMural(@PathVariable("muralRegestrationId") Integer muralRegestrationId) {
		return muralService.getMural(muralRegestrationId);
	}
}
