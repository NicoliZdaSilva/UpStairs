package Dao;

import Model.Administrador;

/**
 *
 * @author thaia
 */
public class AdministradorDAO extends GenericDAOImp<Administrador> {
    public Administrador findByEmail(String email){
        
        Administrador adm = null;
        try {
            em.getTransaction().begin();
            adm = em.createQuery("SELECT a FROM Administrador a WHERE a.email = :email", Administrador.class)
                  .setParameter("email", email)
                  .getSingleResult();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
           
        }
        
        return adm;
    }
}
