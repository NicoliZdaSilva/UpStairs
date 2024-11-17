/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Aluno;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thaia
 */
public class GenericDAOImp<T extends Identifier> implements IGenericDAO<T>{
    
    private final EntityManagerFactory emf;
    private final EntityManager em;
    private final Class<?> classType;

    public GenericDAOImp() {
        emf = Persistence.createEntityManagerFactory("UpStairs");
        em = emf.createEntityManager();
        classType = getGenericTypeClass();
    }
    
    @Override
    public void save(T obj) {
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    @Override
    public T delete(int id) {
        T obj = null;
      
        try {
            em.getTransaction().begin();
            obj = em.find((Class<T>) classType, id);
            em.remove(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return obj;
    }

    @Override
    public void update(T obj) {
         try{
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally{
            closeConnection();
        }
    }

    @Override
    public T find(int id) {
        T obj = null;
        try {
            em.getTransaction().begin();
            obj = em.find((Class<T>) classType, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            //Maybe close the conn
        }
        
        return obj;
    }

    @Override
    public Map<Long, T> findAll() {
        Map<Long, T> objsMap = new HashMap<>();
        String query = "select o from " + classType.getSimpleName() + " o";
        try {
            em.getTransaction().begin();
            List<T> listObjs = em.createQuery(query).getResultList();
            for (T obj : listObjs) {
                objsMap.putIfAbsent(obj.getId(), obj);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return objsMap;
    }
    
    public void closeConnection(){
        em.close();
        emf.close();
    }
    
    /**
     * This is used the return the Class<T> type instance of the current generic
     * type <T> defined in the subclass implementation. As it is needed to fetch
     * items with the EntityManager.
     * @return Class<T> type
     */
     public Class<?> getGenericTypeClass() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (type instanceof Class<?>) {
                return (Class<?>) type;
            }
        }
        return Object.class;
    }
}
