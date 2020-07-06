package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Controller
public class LoginController {
     @Autowired
	LoginService service;
	
	
     public String hello() {
    	 return "yipeee";
     }
     
     
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@ResponseBody this is used to give the response to the browser as a return of that method ie : displays login
	public String showLoginPage() {
		return "login";	
	}
	
	  @RequestMapping(value = "/login", method = RequestMethod.POST) 
	  public String handleLoginPage(@RequestParam String name,@RequestParam String password,ModelMap model) { 
		  if (!service.validateUser(name, password)) {
			  model.put("errorMessage", "invalid credentials");
			return "login";
		}
		  
		  model.put("name", name);
		  model.put("password", password);
		  return "welcome";
	  }
	 
}
