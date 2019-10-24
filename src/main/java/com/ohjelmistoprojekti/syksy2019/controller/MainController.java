/**
 * 
 */

package com.ohjelmistoprojekti.syksy2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

	@GetMapping({"/", "/index"})
	public String index() {
		return "index";
	}
	
}
