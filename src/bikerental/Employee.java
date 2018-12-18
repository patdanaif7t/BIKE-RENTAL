/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

/**
 *
 * @author firstx
 */
public class Employee {
    String employeeId;
    String password;
    String role;
    
    public Employee(){
        
    }

    public Employee(String employeeId, String password, String role) {
        this.employeeId = employeeId;
        this.password = password;
        this.role = role;
    }
    

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
