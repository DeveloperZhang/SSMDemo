package com.vicent.o2o;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vicent.o2o.util.DESUtil;

@RestController
public class Hello {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		//返回Hello SpringBoot!
		String username = DESUtil.getEncryptString("root");
		String password = DESUtil.getEncryptString("111111");
		return username+"\n"+password;
	}
}
