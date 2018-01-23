package com.moda.basico;

public class Costurero extends Tienda implements iTienda {

	private int id;
	private String especialidad;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String presentacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String disenar() {
		// TODO Auto-generated method stub
		return " le ayudará en la especialidad de ";
	}

	@Override
	public String modelar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viajar() {
		// TODO Auto-generated method stub
		return null;
	}

}
