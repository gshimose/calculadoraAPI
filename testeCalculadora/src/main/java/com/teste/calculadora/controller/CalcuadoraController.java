package com.teste.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teste.calculadora.service.CalcuadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalcuadoraController {
	
	
	@Autowired
	private CalcuadoraService calcuadoraService;
	
	@ResponseBody
	@GetMapping("/somar/{a}/{b}")
	public String somar (@PathVariable("a") int a, @PathVariable("b") int b) {
		
		int calculo = calcuadoraService.soma(a, b);
		String retorno = "O Resultado da soma é " + calculo;
		
		return retorno;
	}
	
	
	@ResponseBody
	@GetMapping("/subtrair/{a}/{b}")
	public String subtrair (@PathVariable("a") int a, @PathVariable("b") int b) {
		
		int calculo = calcuadoraService.subtrair(a, b);
		String retorno = "O Resultado da subtração é " + calculo;
		
		return retorno;
	}
	

}
