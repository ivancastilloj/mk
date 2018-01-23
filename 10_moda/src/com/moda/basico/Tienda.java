package com.moda.basico;

public abstract class Tienda {
	
	private String nombre;
	private String CIF;
	private String disenador;
	private int tel;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getDisenador() {
		return disenador;
	}
	public void setDisenador(String disenador) {
		this.disenador = disenador;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
}
