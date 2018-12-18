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
public class CustomerDao implements DaoInterface<Customer> {
    
    private static MongoCollection<Customer> cusCol;
    
    public CustomerDao() {
        cusCol = Database.getDatabase().getCollection("customers", Customer.class);
    } 
    

    @Override
    public boolean insert(Customer customer) {
        try {
            cusCol.insertOne(customer);     
            return true;
        } catch (Exception e) {
            return false;
        }    }

    @Override
    public boolean update(String custoerId, Customer newCustomer) {
        Gson gson = new Gson();
        Document newCus = Document.parse(gson.toJson(newCustomer));
        try {
            cusCol.updateOne(eq("customerId", custoerId), newCus);
            return true;
        } catch (Exception e) {
            return false;
        }    }

    @Override
    public boolean delete(String id) {
        Document customer = new Document("customerId", id);
        try {
            cusCol.deleteOne(customer);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Customer findById(String customerCitizenId) {
        return cusCol.find(eq("customerCitizenId", customerCitizenId)).first();
    }

    @Override
    public List<Customer> findAll() {
        return cusCol.find().into(new ArrayList<>());
    }
    
}
