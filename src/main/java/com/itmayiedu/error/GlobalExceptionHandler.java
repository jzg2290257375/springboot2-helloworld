package com.itmayiedu.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = "com.itmayiedu.controller")
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String ,Object> errorResult(){
		Map<String, Object> errorResultMap = new HashMap<String, Object>();
		errorResultMap.put("errorCode", "500");
		errorResultMap.put("errorMsg", "¥ÌŒÛ «");
		return errorResultMap;
	}
}
