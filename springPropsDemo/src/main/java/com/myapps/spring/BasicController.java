package com.myapps.spring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@ComponentScan(basePackages="com.myapps.spring")

@Controller
public class BasicController {
	@Value("${userWelcomeMessage}") String message;
	
	@Autowired 
	@Qualifier("props")
	Map map;
	
	@RequestMapping(method=RequestMethod.GET, value="/welcome")
	public ModelAndView sayHi(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("welcomeMessage", message);
		mv.addObject("fromXML", map.get("xmlConfigProp"));
		mv.setViewName("home");
		return mv;
	}
}
