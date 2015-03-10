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
    private static long idNum = 9999;
    
    public Employee(String name){
        this.name = name;
        this.idNum = ++idNum;
    
    }
    
    /**
     * Creates and returns a bill
     * @param cart
     * @param counterNum
     * @param emp
     * @return Adds employee and counter information to bill and returns it.
     */
    public static Bill scanCart(Cart cart, int counterNum, Employee emp){
        return new Bill( cart.getCart(), counterNum , emp );
    }
    
    /**
     * Returns name of employee. 
     * @return Name as a String.
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Returns id number.
     * @return Id in long format
     */
    public Long getId(){
        return this.idNum;
    }
}
