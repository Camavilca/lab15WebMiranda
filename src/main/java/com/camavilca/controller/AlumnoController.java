package com.camavilca.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.camavilca.model.Alumno;

@Controller
public class AlumnoController implements WebMvcConfigurer {

	
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/resultado").setViewName("resultado");
	}
	@GetMapping("/")
	public String showForm(Alumno alumno) {
		return "formulario";
	}
	@PostMapping("/")
	public String checkPersonInfo(@Valid Alumno alumno, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "formulario";
		}

		return "redirect:/resultado";
	}
}
