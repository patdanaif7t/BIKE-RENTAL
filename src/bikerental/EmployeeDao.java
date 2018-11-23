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
 * @author firstx
 */
public class EmployeeDao {
    private static MongoCollection<Employee> empCol;
    
    public EmployeeDao() {
        empCol = Database.getDatabase().getCollection("employees", Employee.class);
    } 
    
    public boolean addEmployee(Employee employee) {
        try {
            empCol.insertOne(employee);     
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Employee getEmployeeById(String employeeId) {
        return empCol.find(eq("employeeId", employeeId)).first();
    }

    
    public List<Employee> getAllEmployee() {
        return empCol.find().into(new ArrayList<>());
    }
    
    public boolean editEmployeeById(String employeeId, Employee newEmployee) {
        Gson gson = new Gson();
        Document oldEmp = new Document("employeeId", employeeId);
        Document newEmp = Document.parse(gson.toJson(newEmployee));
        try {
            empCol.updateOne(oldEmp, newEmp);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean deleteEmployee(String employeeId) {
        Document employeeDoc = new Document("employeeId", employeeId);
        try {
            empCol.deleteOne(employeeDoc);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
