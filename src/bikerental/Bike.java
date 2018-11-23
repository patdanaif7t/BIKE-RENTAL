/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

/**
 *
 * @author anupongpummok
 */
public final class Bike {
    private String bikeId;
    private String bikeStatus;
    
    public Bike() {
        
    }

    public Bike(String bikeId, String bikeStatus) {
        this.bikeId = bikeId;
        this.bikeStatus = bikeStatus;
    }

    public Bike(String bikeId) {
        this.bikeId = bikeId;
    }
    
    @Override
    public String toString() {
        return "Bike{" + "bikeId=" + bikeId + ", bikeStatus=" + bikeStatus + '}';
       
        
    }

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(final String id) {
        this.bikeId = id;
    }

    public String getBikeStatus() {
        return bikeStatus;
    }

    public void setBikeStatus(final String status) {
        this.bikeStatus = status;
    }
    
}
