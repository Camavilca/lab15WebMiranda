package com.camavilca.controller;

import java.util.Map;

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
	public String checkPersonInfo(@Valid Producto producto, BindingResult bindingResult,Map m) {
		if (bindingResult.hasErrors()) {
			return "form";
		}
		double precio = producto.getPrecio();
		int cantidad = producto.getCantidad();
		double importe = cantidad * precio;
		double res;
		if(importe>1000) {
			res = importe - (importe*0.5);
		}else {
			res = importe;
		}
		m.put("producto", res);
		m.put("pro", producto);
		return "resu";
	}
}
