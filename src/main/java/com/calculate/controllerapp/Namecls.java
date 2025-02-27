package com.calculate.controllerapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app/")
public class Namecls {

	@GetMapping("/name")
	@ResponseBody
	public String printName() {
		String str = "Brixbit Technology Soluction!...";
		String s = "from chennai.";
		return str + " " + s;
	}

}
