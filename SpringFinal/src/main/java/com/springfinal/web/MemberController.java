package com.springfinal.web;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springfinal.web.domain.Member;
import com.springfinal.web.service.PersonService;

@Controller
@RequestMapping(value="/Member")
public class MemberController {
	
   private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
   @Autowired
   private PersonService personService;
   @RequestMapping(value ="/PersonSelect", method = RequestMethod.GET)
	public String person(Locale locale, Model model) {
		logger.info("Member PersonSelect");
		List<Member> list = personService.selectPersonDTO();
		model.addAttribute("list", list );
//		dddddddf
		return "Member";
	}
	
}
