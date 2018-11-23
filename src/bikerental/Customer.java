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
public final class Customer {
    private String cusCitizenId;
    private String cusTel;
    private String cusFName;
    private String cusLName;
    
    public Customer() {
        
    }

    public Customer(String cusCitizenId, String cusFName, String cusLName, String cusTel) {
        this.cusCitizenId = cusCitizenId;
        this.cusTel = cusTel;
        this.cusFName = cusFName;
        this.cusLName = cusLName;
    }

    public String getCusCitizenId() {
        return cusCitizenId;
    }

    public void setCusCitizenId(final String cusCitizenId) {
        this.cusCitizenId = cusCitizenId;
    }

    @Override
    public String toString() {
        return "Customer{" + "cusCitizenId=" + cusCitizenId + ", cusTel=" + cusTel + ", cusFName=" + cusFName + ", cusLName=" + cusLName + '}';
    }

    public String getCusTel() {
        return cusTel;
    }

    public void setCusTel(final String cusTel) {
        this.cusTel = cusTel;
    }

    public String getCusFName() {
        return cusFName;
    }

    public void setCusFName(final String cusFName) {
        this.cusFName = cusFName;
    }

    public String getCusLName() {
        return cusLName;
    }

    public void setCusLName(final String cusLName) {
        this.cusLName = cusLName;
    }
    
    
}
