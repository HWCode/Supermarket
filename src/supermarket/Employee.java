/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author Davyn
 */
public class Employee {
    
    private String name;
    private long idNum = 9999;
    
    public Employee(String name){
        this.name = name;
        this.idNum = ++idNum;
    
    }
}
