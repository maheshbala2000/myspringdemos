package com.myapps.spring;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@PropertySource("classpath:quotes.properties")
@Controller
public class BasicController {
	@Autowired
	Environment env;
	
	@RequestMapping(method=RequestMethod.GET, value="/loginPage" )
	public ModelAndView showLoginPage(){
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("login");
		return mnv;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/welcomePage" )
	public ModelAndView userPage(@ModelAttribute Principal principal){
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("welcome");
		String username = principal.getName();
		mnv.addObject("quote", env.getProperty("qotd"));
		mnv.addObject("user", username);
		return mnv;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/adminPage" )
	public ModelAndView adminPage(Principal principal){
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("admin");
		return mnv;
	}
	
}
