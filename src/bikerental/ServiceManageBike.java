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
public class ServiceManageBike {
    BikeDao bikeDao;
    
    public ServiceManageBike(){
        bikeDao = new BikeDao();
    }
    
    public Bike findBikeById(String bikeId) {
        return bikeDao.findById(bikeId);
    }
    
    public List<Bike> findAllBike() {
        return bikeDao.findAll();
    }
    
    public boolean addBike(Bike bike) {
        return bikeDao.insert(bike);
    }
    
    public boolean removeBikeById(String bikeId) {
        return bikeDao.delete(bikeId);
    }
}
