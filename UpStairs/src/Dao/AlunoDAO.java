package Dao;

import Model.Aluno;

/**
 *
 * @author thaia
 */
public class AlunoDAO extends GenericDAOImp<Aluno> {

    public Aluno findByEmail(String email){
        
        Aluno alu = null;
        try {
            em.getTransaction().begin();
            alu = em.createQuery("SELECT a FROM Aluno a WHERE a.email = :email", Aluno.class)
                  .setParameter("email", email)
                  .getSingleResult();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
           
        }
        
        return alu;
    }
}
