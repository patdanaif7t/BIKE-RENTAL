/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import java.util.List;

/**
 *
 * @author WHO.AM.I
 */
public class ServiceBikeStatus {
      BikeDao bikeDao;

    public ServiceBikeStatus() {
        bikeDao = new BikeDao();

    }
      
       
    public Bike findBikeById(String bikeId) {
        return bikeDao.findById(bikeId);
    }
    
    public List<Bike> getAllBike() {
        return bikeDao.findAll();
    }
    
      
    
}
