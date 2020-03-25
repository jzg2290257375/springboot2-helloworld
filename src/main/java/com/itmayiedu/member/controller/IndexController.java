package com.itmayiedu.member.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(IndexController.class); 
	
	@RequestMapping("/index")
	public String index() {
		logger.info("好像是真的");
		return "整的成功了";
	}
}
