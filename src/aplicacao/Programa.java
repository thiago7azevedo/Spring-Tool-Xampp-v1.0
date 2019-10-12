package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = new Pessoa(2, null, null); // JPA busca uma pessoa do BD, converte em objeto e retorna
		
		em.remove(p);
		
		System.out.println(p);
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}  
