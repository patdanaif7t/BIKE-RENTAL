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
public class EmployeeDao implements DaoInterface<Employee>{
    private static MongoCollection<Employee> empCol;
    
    public EmployeeDao() {
        empCol = Database.getDatabase().getCollection("employees", Employee.class);
    } 

    @Override
    public boolean insert(Employee employee) {
        try {
            empCol.insertOne(employee);     
            return true;
        } catch (Exception e) {
            return false;
        }    }

    @Override
    public boolean update(String employeeId, Employee newEmployee) {
        Gson gson = new Gson();
        Document newEmp = Document.parse(gson.toJson(newEmployee));
        try {
            empCol.updateOne(eq("employeeId", employeeId), newEmp);
            return true;
        } catch (Exception e) {
            return false;
        }    }

    @Override
    public boolean delete(String employeeId) {
        Document employeeDoc = new Document("employeeId", employeeId);
        try {
            empCol.deleteOne(employeeDoc);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Employee getById(String employeeId) {
        return empCol.find(eq("employeeId", employeeId)).first();
    }

    @Override
    public List<Employee> getAll() {
        return empCol.find().into(new ArrayList<>());
    }
}
