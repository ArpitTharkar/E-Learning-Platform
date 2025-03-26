package com.learningstd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learningstd.model.tcoures;
import com.learningstd.repository.tcourepo;


@Controller
public class tcoursecontroller
{
		@Autowired
		public tcourepo er;
		@RequestMapping("/addcou")
		public String addcourse(@ModelAttribute tcoures s)
		{
			System.out.println(s);
			er.save(s);
			return "demo.jsp";
			
		}
		
		@RequestMapping("/datafetch")
		public String fetch(Model m)
		{
			List<tcoures>e_data=er.findAll();
			System.out.println(e_data);
			m.addAttribute("data", e_data);
			return "datafetch.jsp";
			
		}
		
	
	

}
