package com.udemy.nelio.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.udemy.nelio.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		/*INSTANCIANDO OBJETOS DA TABELA 
		Pessoa p1 = new Pessoa(null, "Celso Pena", "celsop23@gmail.com");
		Pessoa p2 = new Pessoa(null, "Elis Regina", "regina_elis@gmail.com");
		Pessoa p3 = new Pessoa(null, "Carminha Nazaré", "nazaconfusa@gmail.com");*/

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		/* CRIAR NO BANCO DE DADOS
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		
		/* MÉTODO FIND
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);	
		*/
		
		//OBJ EM EVIDENCIA "DETACHED"
		//Pessoa p = new Pessoa(2, null, null);
		Pessoa p = em.find(Pessoa.class, 2);
		
		//NÃO ESQUECER TRANSACTION PARA APAGAR NO BANCO DE DADOS TBM
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!!");
		em.close();
		emf.close();
		
	}

}
