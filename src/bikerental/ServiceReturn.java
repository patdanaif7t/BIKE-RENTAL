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
public class ServiceReturn {

    BikeDao bikeDao;
    CustomerDao customerDao;
    InvoiceDao invoiceDao;

    public ServiceReturn() {
        bikeDao = new BikeDao();
        customerDao = new CustomerDao();
        invoiceDao = new InvoiceDao();
    }

    public boolean returnInvoice(String invoiceId, String bikeId, String status, float fine) {
        try {

            if (status.equals("ยังไม่คืน")) {
                bikeDao.switchStatusById(bikeId, "ถูกเช่า");
            }
            
            invoiceDao.updateReturn(invoiceId, status, fine);

        } catch (Exception e) {
            //เช่าไม่สำเร็จ
            return false;
        }
        //เช่าสำเร็จ
        return true;
    }

    public List<Invoice> findAllInvoice() {
        return invoiceDao.findAll();
    }
    
    public Invoice findInvoiceById(String invoiceId) {
        return invoiceDao.findById(invoiceId);
    }
    

}
