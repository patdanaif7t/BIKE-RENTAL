/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;
import java.util.Date;

/**
 *
 * @author anupongpummok
 */
public final class Invoice {
    private String invoiceId;
    private String bikeId;
    private String dateRent;
    private String dateReturn;
    private String dateReturnReal;
    private String status;
    private Customer customer;
    private float fee;
    private float fine;

    public Invoice(String invoiceId,
            String bikeId,
            String dateRent,
            String dateReturn,
            String status,
            Customer customer,
            float fee) {
        this.invoiceId = invoiceId;
        this.bikeId = bikeId;
        this.dateRent = dateRent;
        this.dateReturn = dateReturn;
        this.status = status;
        this.customer = customer;
        this.fee = fee;
    }
    
    public Invoice() {
        
    }
    
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String id) {
        this.invoiceId = id;
    }

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }

    public String getDateRent() {
        return dateRent;
    }

    public void setDateRent(String dateRent) {
        this.dateRent = dateRent;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    public String getDateReturnReal() {
        return dateReturnReal;
    }

    public void setDateReturnReal(String dateReturnReal) {
        this.dateReturnReal = dateReturnReal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public float getFine() {
        return fine;
    }

    public void setFine(float fine) {
        this.fine = fine;
    }
    
    
    
}
