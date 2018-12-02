package com.camavilca.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.camavilca.model.Producto;

@Controller
public class ProductoController implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/resu").setViewName("resu");
	}

	@GetMapping("/producto")
	private String getInicio(Producto producto) {
		return "form";
	}

	@PostMapping("/producto")
	public String checkPersonInfo(@Valid Producto producto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form";
		}
		return "redirect:/resu";
	}
}
