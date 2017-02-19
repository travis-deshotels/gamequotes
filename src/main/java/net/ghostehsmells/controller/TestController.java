package net.ghostehsmells.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String Test(){
		return "index.html";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Test2(){
		return "index2.html";
	}
}
