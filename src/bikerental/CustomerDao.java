/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author anupongpummok
 */
public class CustomerDao {
    
    private static MongoCollection<Customer> cusCol;
    
    public CustomerDao() {
        cusCol = Database.getDatabase().getCollection("customers", Customer.class);
    } 
    
    public boolean addCustomer(Customer customer) {
        try {
            cusCol.insertOne(customer);     
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Customer getCusById(String cusCitizenId) {
        return cusCol.find(eq("cusCitizenId", cusCitizenId)).first();
    }
    

    
    public List<Customer> GetAllCustomer() {
        return cusCol.find().into(new ArrayList<>());
    }
    
    public boolean editCustomer(Customer customer, Customer newCustomer) {
        Gson gson = new Gson();
        Document oldCus = Document.parse(gson.toJson(customer));
        Document newCus = Document.parse(gson.toJson(newCustomer));
        try {
            cusCol.updateOne(oldCus, newCus);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
