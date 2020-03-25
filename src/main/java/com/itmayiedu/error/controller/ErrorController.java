package com.itmayiedu.error.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

	@RequestMapping("/getUser")
	public String getUser(int i) {
		int j;
		try {
			j = 1/i;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "ÏµÍ³´íÎó";
		} 
		return "success"+j;
	}
}
