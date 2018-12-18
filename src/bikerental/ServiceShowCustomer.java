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
public class ServiceShowCustomer {

    CustomerDao customerDao;

    public ServiceShowCustomer() {
        customerDao = new CustomerDao();
    }
    
    public List<Customer> findAllCustomer(){
        return customerDao.findAll();
    }
    
    public Customer findCustomerById(String customerId) {
        return customerDao.findById(customerId);
    }
}
