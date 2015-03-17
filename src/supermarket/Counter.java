/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.Queue;

/**
 *
 * @author Davyn
 */
public class Counter<Carts>  {
   
    private java.util.Queue<Carts> carts;
    private java.util.Stack<Bill> bills;
    private Employee currentEmployee;
    private static int thisCounterNum;
    
    /**
     * 
     * @param employee 
     */
    public Counter(Employee employee){
        carts = new java.util.LinkedList<Carts>();
        bills = new java.util.Stack<Bill>();
        currentEmployee = employee;
        ++thisCounterNum;
    }
    
    /**
     * 
     * @param customer 
     */
    public void addCart(Cart customer){
        carts.add((Carts) customer);
    }
    
    /**
     * 
     */
    public void removeCartAndBill(){
        
       Bill ned = currentEmployee.scanCart( front(), thisCounterNum, currentEmployee );
       bills.push(ned);
       carts.remove();
       bills.pop().printBill();
       
    }
    
    
    
    /**
     * 
     */
    public void lookAt(){
        carts.element();
    }
    
    /**
     * 
     * @return 
     */
    public int size(){
        return carts.size();
    }
    
    /**
     * 
     * @return 
     */
    public boolean isEmpty(){return true;}
    
    /**
     * 
     * @return 
     */
    public Cart front(){
        return (Cart) carts.element();
    }
    

    
}
