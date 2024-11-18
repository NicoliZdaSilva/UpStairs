package Dao;

import Model.Professor;

/**
 *
 * @author thaia
 */
public class ProfessorDAO extends GenericDAOImp<Professor>{
    public Professor findByEmail(String email){
        
        Professor prof = null;
        try {
            em.getTransaction().begin();
            prof = em.createQuery("SELECT a FROM professor a WHERE a.email = :email", Professor.class)
                  .setParameter("email", email)
                  .getSingleResult();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
           
        }
        
        return prof;
    }
}
