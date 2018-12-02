package com.camavilca.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String checkPersonInfo(@Valid Alumno alumno, BindingResult bindingResult,Map m) {
		if (bindingResult.hasErrors()) {
			return "formulario";
		}
		int n1 = alumno.getNota1();
		int n2 = alumno.getNota2();
		int n3 = alumno.getNota3();
		int pro = (n1+n2+n3)/3;
		m.put("promedio", pro);
		m.put("alumno",alumno);
		return "resultado";
	}
}
