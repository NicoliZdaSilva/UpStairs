package Dao;

import Model.Pessoa;
import Model.Professor;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class DaoCadastroProfessor {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

    public static boolean insert(Professor p) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Nicoli Zimmermann");
        professor.setEmail("nicoli@gmail.com");
        professor.setSenha("1234");
    }
}
