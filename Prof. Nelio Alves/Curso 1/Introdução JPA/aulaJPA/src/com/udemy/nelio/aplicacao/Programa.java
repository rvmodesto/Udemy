package com.udemy.nelio.aplicacao;

import com.udemy.nelio.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1 = new Pessoa(1, "Celso Pena", "celsop23@gmail.com");
		Pessoa p2 = new Pessoa(2, "Elis Regina", "regina_elis@gmail.com");
		Pessoa p3 = new Pessoa(3, "Carminha Nazaré", "nazaconfusa@gmail.com");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
