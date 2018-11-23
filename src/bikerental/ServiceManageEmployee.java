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
public class ServiceManageEmployee {
    EmployeeDao empDao;
    
    public ServiceManageEmployee(){
        empDao = new EmployeeDao();
    }
    
    public boolean isFill(String field) {
        return !field.equals("");
    }
    
    public boolean isFieldAllFill() {
        return true;
    }
    
    public Employee search(String emplyeeId) {
        return empDao.getById(emplyeeId);
    }
    
    public List<Employee> searchAll() {
        return empDao.getAll();
    }
    
    public boolean insertEmployee(Employee employee) {
        return empDao.insert(employee);
    }
    
    public boolean editEmployee(String employeeId, Employee newEmployee) {
        return empDao.update(employeeId, newEmployee);
    }
    
    public boolean deleteEmployee(String employeeId) {
        return empDao.delete(employeeId);
    }
}
