package com.example.demo.matriculacion.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.repository.modelo.Matricula;
import com.example.demo.matriculacion.repository.modelo.Propietario;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository{
	
	@Autowired
	private Matricula matricula;
	
	@Autowired
	private static List<Matricula> baseDatos;

	@Override
	public void crearMatricula(Propietario p, Vehiculo v) {
		
		
		matricula.setP(p);
		matricula.setV(v);
		
	}

	@Override
	public Matricula buscarMatricula(String idMatricula) {
		// TODO Auto-generated method stub
		return null;
	}




}
