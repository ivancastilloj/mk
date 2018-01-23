package com.moda.basico;

public class Disenador extends Tienda implements iTienda {

	private String temporada;
	private String pasarela;
	
	
	
	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getPasarela() {
		return pasarela;
	}

	public void setPasarela(String pasarela) {
		this.pasarela = pasarela;
	}

	@Override
	public String presentacion() {
		// TODO Auto-generated method stub
		return "Esta temporada presentará ";
	}

	@Override
	public String disenar() {
		// TODO Auto-generated method stub
		return "Diseña para";
	}

	@Override
	public String modelar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viajar() {
		// TODO Auto-generated method stub
		return " viaja a ";
	}

}
