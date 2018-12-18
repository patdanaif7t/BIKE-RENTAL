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

    private String customerCitizenId;
    private String customerFName;
    private String customerLName;
    private String customerTel;

    public Customer() {

    }

    public Customer(String customerCitizenId, String customerFName, String customerLName, String customerTel) {
        this.customerCitizenId = customerCitizenId;
        this.customerFName = customerFName;
        this.customerLName = customerLName;
        this.customerTel = customerTel;
    }

    public String getCustomerCitizenId() {
        return customerCitizenId;
    }

    public void setCustomerCitizenId(String customerCitizenId) {
        this.customerCitizenId = customerCitizenId;
    }

    public String getCustomerFName() {
        return customerFName;
    }

    public void setCustomerFName(String customerFName) {
        this.customerFName = customerFName;
    }

    public String getCustomerLName() {
        return customerLName;
    }

    public void setCustomerLName(String customerLName) {
        this.customerLName = customerLName;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }


}
