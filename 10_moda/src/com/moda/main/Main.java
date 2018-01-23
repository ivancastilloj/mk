package com.moda.main;

import com.moda.basico.Costurero;
import com.moda.basico.Disenador;
import com.moda.basico.Modelo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Costurero c1=new Costurero();
		Modelo m1=new Modelo();
		Disenador d1=new Disenador();
		d1.setPasarela("Paris");
		d1.setTemporada("Primavera/Verano");
		d1.setNombre("MK");
		d1.setCIF("71616498G");
		d1.setDisenador("Michael Kors");
		d1.setTel(695842165);
		m1.setAltura(1.79f);
		m1.setPeso(65);
		m1.setNombre("Francisco");
		m1.setCIF("71616498G");
		m1.setDisenador("Michael Kors");
		m1.setTel(695842165);
		c1.setEspecialidad("Zapatos");
		c1.setId(65);
		c1.setNombre("Manoli");
		c1.setCIF("71616498G");
		c1.setDisenador("Michael Kors");
		c1.setTel(695842165);
		System.out.println(m1.getNombre()+m1.modelar()+" altura: "+m1.getAltura()+ "cm, peso: "+ m1.getPeso()+" kg");
		System.out.println(d1.getDisenador()+d1.viajar()+ d1.getPasarela()+" para la temporada "+ d1.getTemporada());
		System.out.println(c1.getNombre()+c1.disenar()+ c1.getEspecialidad()+" a "+ d1.getDisenador());
	}

}
