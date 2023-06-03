package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public class CalcularValorMatriculaManualImpl implements CalcularValorMatricula{

	@Override
	public BigDecimal valorMat(Vehiculo v) {
		BigDecimal valorFinal = v.getPrecio().multiply(new BigDecimal(0.15));
		return valorFinal;
	}

}
