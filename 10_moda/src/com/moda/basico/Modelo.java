package com.moda.basico;

public class Modelo extends Tienda implements iTienda{

		private float altura;
		private int peso;
		
		
	public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

	@Override
	public String presentacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String disenar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modelar() {
		// TODO Auto-generated method stub
		return  " modelar� con las siguientes medidas:";
	}

	@Override
	public String viajar() {
		// TODO Auto-generated method stub
		return "Viajar� junto a la tienda ";
	}

}
