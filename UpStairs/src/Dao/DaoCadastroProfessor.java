package Dao;

import Model.Professor;

public class DaoCadastroProfessor extends Dao {

    public boolean insert(Professor p) {
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
}
