package net.iveiculos.iveiculos.controller;

import net.iveiculos.iveiculos.service._CriarBaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	
	@Autowired
	private _CriarBaseService criarBaseService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {		
		return "home";
	}
	
	@RequestMapping(value = "/criar_base", method = RequestMethod.GET)
	public String criarBase() {
		this.criarBaseService.execute();
		return "redirect:/";
	}
	
}
