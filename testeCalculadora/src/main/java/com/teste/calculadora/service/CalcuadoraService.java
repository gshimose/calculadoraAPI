package com.teste.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalcuadoraService {
	
	public int soma (int a, int b) {
		
		int resultado = a + b;
		return resultado;
	}

	
	public int subtrair (int a, int b) {
		
		int resultado = a - b;
		return resultado;
	}
	
}
