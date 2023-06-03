package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.repository.modelo.Propietario;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private Propietario propietario;
	
	@Autowired
	private Vehiculo vehiculo;
	
	@Override
	public void realizar(Propietario p, Vehiculo v) {
		this.propietario = p;
		this.vehiculo = v;
		
		
	}

	

}
