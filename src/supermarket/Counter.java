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
    private java.util.Stack bills;
    
    public Counter(){
        carts = new java.util.LinkedList<Carts>();
        bills = new java.util.Stack<>();
    }
    
    public void addCart(Cart customer){
        carts.add((Carts) customer);
    }
    
    public void lookAt(){
        carts.element();
    }
    
    public int size(){
        return carts.size();
    }
    
    public boolean isEmpty(){return true;}
    
    public Cart front(){
        return (Cart) carts.element();
    }
    
    public void enqueue(){}
    
    
}
