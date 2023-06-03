package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public interface CalcularValorMatricula {

	public BigDecimal valorMat(Vehiculo v);
	
}
