package com.learningstd.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningstd.model.stuestu;
import com.learningstd.repository.sturepo;

@Controller
public class stucontroller
{
	@Autowired
	public sturepo erepoo;
//	@GetMapping("/")
//	public String register()
//	{
//		return "sregister.jsp";
//	}
	@PostMapping("/sRegister")
	public String reg(@ModelAttribute stuestu tea) 
	{
		System.out.println(tea);
		erepoo.save(tea);
		return "slogin.jsp";
	}
	@GetMapping ("/salogin")
	public String slogin(@RequestParam String semail,@RequestParam String spassword)
	{
		System.out.println(semail+" "+spassword);
		stuestu ob1=erepoo.findBysemail(semail);
		if(ob1!=null && ob1.getSemail().equalsIgnoreCase(semail)&&ob1.getSpassword().equals(spassword))
		{
			return"swelcome.jsp";
		}else 
		{
			return "slogin.jsp";
		}
		
	}
	
}
