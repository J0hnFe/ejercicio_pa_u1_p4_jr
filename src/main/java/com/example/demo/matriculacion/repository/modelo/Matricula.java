package com.example.demo.matriculacion.repository.modelo;

public class Matricula {

	private String idMatricula;
	private Propietario propietario;
	private Vehiculo vehiculo;
	
	
	//toString
	@Override
	public String toString() {
		return "Matricula [propietario=" + propietario + ", vehiculo=" + vehiculo + "]";
	}
	
	//Getters y Setters
	public Propietario getP() {
		return propietario;
	}
	public void setP(Propietario p) {
		this.propietario = p;
	}
	public Vehiculo getV() {
		return vehiculo;
	}
	public void setV(Vehiculo v) {
		this.vehiculo = v;
	}

	public String getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(String idMatricula) {
		this.idMatricula = idMatricula;
	}	
	
	
}
