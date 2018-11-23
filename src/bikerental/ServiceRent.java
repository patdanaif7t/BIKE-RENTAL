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
    
    public void alertMessage(String message){
        JLabel label = new JLabel(message);
            label.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
              JOptionPane.showMessageDialog(null,label,"ERROR",JOptionPane.WARNING_MESSAGE);
    }
    
    public boolean isCitizenIdValid(String citizenId) {
//        cus = cusDao.getCusById(citizenId);
//        int sum = 0;
//        for (int i = 0; i < 12; i++) {
//            sum += Character.getNumericValue(cus.getCusCitizenId().charAt(i))*(13-i);
//        }
//        return (11-sum%11)%10 == Character.getNumericValue(cus.getCusCitizenId().charAt(12));
        
        return citizenId.length() == 13;
    }
    
    public boolean isBikeAvailable(Bike bike) {
        return bike.getBikeStatus().equals("ว่าง");
    }
    
    public boolean isTelvalid(String telField) {
        return telField.length() == 10;
    }
    
    public boolean isFill(String field) {
        return !field.equals("");
    }
    
    public String getCurrentDate(){
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }
    
    public boolean isFieldAllFill(String bikeId , String citizenId , String fName , String lName , String Tel , String rentId , String rentDate ,String returnDate , String fee) {

        if(!isFill(bikeId)||
                !isFill(citizenId)||
                !isFill(fName)||
                !isFill(lName)||
                !isFill(Tel)||
                !isFill(rentId)||
                !isFill(rentDate)||
                !isFill(returnDate)||
                !isFill(fee)){
            return false ; //กรอกข้อมูลไม่ครบ
        }else{
            return true ; //กรอกข้อมูลครบ
        }
        
    }

    public int calculateFee (Date rentDate , Date returnDate){
       
        long diffInMillies = Math.abs(returnDate.getTime() - rentDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        
        return (int)diff;
        
    }
    
    
    public boolean Rent(String bikeId,String status, Customer customer,Invoice invoice) {
        try {
            
            bikeDao.switchStatusById(bikeId,status);

            if (cusDao.getById(customer.getCusCitizenId()) == null) {
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
        return bikeDao.getById(bikeId);
    }
    
    public List<Bike> getAllBikeItr() {
        return bikeDao.getAll();
    }
    
     public List<Customer> getAllCustomerItr() {
        return cusDao.getAll();
    }

     
    public Customer findCusById(String cusId) {
        return cusDao.getById(cusId);
    }
        
}
