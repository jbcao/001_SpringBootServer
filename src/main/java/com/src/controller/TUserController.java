package com.src.controller;

import javax.annotation.Resource;

import com.src.service.TUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.entity.TUser;
import com.src.service.impl.TUserServiceImpl;

@RestController
@RequestMapping("/TUserController")
public class TUserController {
	@Autowired
	private TUserService tUserService;

	public TUserController() {
	}
//如果出现两个以上相同的@RequestMapping，程序会出错，直接运行的话，控制台并不报出相应错误
//用maven clean install 会打印出具体的错误内容
	@RequestMapping("/saveNewUser")
	public String saveNewUser() {
		int i;
		for (i = 1; i < 10; i++) {
			TUser user = new TUser();
			user.setUserName("user" + i);
			user.setPassword("password");
			user.setAge(i);
			tUserService.insert(user);
		}
		return "success";
	}
}
