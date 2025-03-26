package com.learningstd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningstd.model.eteacher;
import com.learningstd.repository.tecrepo;

@Controller
public class tracontroller
{
	@Autowired
	public tecrepo erepo;
	@GetMapping("/")
	public String register()
	{
		return "register.jsp";
	}
	@PostMapping("/Register")
	public String reg(@ModelAttribute eteacher tea) 
	{
		System.out.println(tea);
		erepo.save(tea);
		return "tlogin.jsp";
	}
	@GetMapping ("/login")
	public String login(@RequestParam String email,@RequestParam String password)
	{
		System.out.println(email+" "+password);
		eteacher ob=erepo.findByEmail(email);
		if(ob!=null && ob.getEmail().equalsIgnoreCase(email)&& ob.getPassword().equals(password))
		{
			return"twelcome.jsp";
		}else 
		{
			return "tlogin.jsp";
		}
		
	}

}
