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
    EmployeeDao employeeDao;
    
    public ServiceManageEmployee(){
        employeeDao = new EmployeeDao();
    }
    
    public Employee findEmployeeById(String employeeId) {
        return employeeDao.findById(employeeId);
    }
    
    public List<Employee> findAllEmployee() {
        return employeeDao.findAll();
    }
    
    public boolean addEmployee(Employee employee) {
        return employeeDao.insert(employee);
    }
    
    public boolean editEmployeeById(String employeeId, Employee newEmployee) {
        return employeeDao.update(employeeId, newEmployee);
    }
    
    public boolean removeEmployeeById(String employeeId) {
        return employeeDao.delete(employeeId);
    }
}
