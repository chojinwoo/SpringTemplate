package org.spring.bangae.main.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.spring.bangae.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private MainService mainService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) throws Exception {
		mainService.selectUsers();
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}