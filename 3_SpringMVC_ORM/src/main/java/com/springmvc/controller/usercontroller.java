package com.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.springmvc.entitie.Employee;
import com.springmvc.service.EmployeeService;

@Controller
public class usercontroller {
	
	@Autowired 
	private EmployeeService eService;
	
	@RequestMapping("/home")
	public String home()
	{
		return "Home";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(path="/logedIn", method= RequestMethod.POST)
	public String logedIn(@ModelAttribute ("employee") Employee employee,HttpSession session,Model m )
	{
	    Employee emp=eService.loginEmp(employee);
	    System.out.println("Employee"+emp);
		if(emp != null) {
			System.out.println("heloo");
			session.setAttribute("loginEmployee", emp);
			return "success";
		}
		else {
			System.out.println("invalid");
			session.setAttribute("msg","invalid username and password ");
			return "redirect:/login";
		}
	}
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping(path="/registered", method= RequestMethod.POST)
	public String registered(@ModelAttribute Employee employee )
	{
		eService.save(employee);
		System.out.println(employee);
		return "registered";
	}
	

	
	

}
