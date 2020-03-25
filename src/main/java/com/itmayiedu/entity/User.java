package com.itmayiedu.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Getter
@Setter
public class User {
	private String name;
	private Integer age;
	
	public static void main(String[] args) {
		System.out.println("打发打发");
		System.out.println();
		log.info("不正确");
		User user = new User();
		user.setName("jiang");
		user.setAge(10);
		System.out.println(user.toString());
		log.info("dfdf");
	}

	
}
