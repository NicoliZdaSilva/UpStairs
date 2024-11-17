package Dao;

import java.util.Map;

/**
 *
 * @author thaia
 */
public interface IGenericDAO<T> {
    
    void save(T type);
    
    T delete(int id);
    
    void update(T type);
    
    T find(int id);
    
    Map<Long, T> findAll();
}
