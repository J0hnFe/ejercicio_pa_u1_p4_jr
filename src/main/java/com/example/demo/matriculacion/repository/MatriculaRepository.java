package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.repository.modelo.Matricula;
import com.example.demo.matriculacion.repository.modelo.Propietario;
import com.example.demo.matriculacion.repository.modelo.Vehiculo;

public interface MatriculaRepository {

	public void crearMatricula(Propietario p, Vehiculo v);
	public Matricula buscarMatricula(String idMatricula);
	
}
