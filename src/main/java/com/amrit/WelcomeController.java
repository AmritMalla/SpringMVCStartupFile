package com.amrit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping
	@ResponseBody
	public String hello() {
		return "Hello from hello";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcome() {
		System.out.println("hello from WelcomeController");
		return "welcome";
	}
}
