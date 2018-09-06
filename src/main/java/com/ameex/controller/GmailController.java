package com.ameex.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GmailController {
	@RequestMapping("welcome")
	public ModelAndView registratin() {
		ModelAndView model=new ModelAndView();
		model.addObject("Ok","welcome");
		return model;
	}
	
	@RequestMapping("hi")
	public String hi() {
		return "hi";
	}

	public String myhome() {
		return "hi";
	}
	public String gmailBranch() {
		return "ook";
	}
	public String masterbranch() {
		return "master";
	}
	/* this is a comment */
	private int ok;
}
