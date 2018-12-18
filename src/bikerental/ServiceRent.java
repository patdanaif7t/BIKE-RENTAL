/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author anupongpummok
 */
public class ServiceRent {
    BikeDao bikeDao;
    CustomerDao cusDao;
    InvoiceDao invDao;
    
    public ServiceRent() {
        cusDao = new CustomerDao();
        bikeDao = new BikeDao();
        invDao = new InvoiceDao();
    }
       
    public boolean Rent(String bikeId,String status, Customer customer,Invoice invoice) {
        try {
            
            bikeDao.switchStatusById(bikeId,status);

            if (cusDao.findById(customer.getCustomerCitizenId()) == null) {
                    cusDao.insert(customer);
            }

            invDao.insert(invoice);     
        
        }catch(Exception e){
                    //เช่าไม่สำเร็จ
            return false;
        }
        //เช่าสำเร็จ
        return true;
        
    }
    
    public Bike findBikeById(String bikeId) {
        return bikeDao.findById(bikeId);
    }
    
    public List<Bike> getAllBike() {
        return bikeDao.findAll();
    }
    
     public List<Customer> getAllCustomer() {
        return cusDao.findAll();
    }

     
    public Customer findCustomerById(String customerId) {
        return cusDao.findById(customerId);
    }
        
}
