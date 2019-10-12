package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		//entidade monitorada
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2); // objeto criado para recuperar o objeto do BD
		em.getTransaction().begin(); //abre a conexão
		em.remove(p); // remove o bojeto que foi buscado acima e colcoado na variavel p.
		em.getTransaction().commit(); // fecha a conexão
		
		
		System.out.println(p);
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}  
