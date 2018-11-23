/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import java.util.List;

/**
 *
 * @author firstx
 */
public interface DaoInterface<T> {
    public boolean insert(T object);
    public boolean update(String id, T newObject);
    public boolean delete(String id);
    public T getById(String id);
    public List<T> getAll();
    
}
