/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import supermarket.*;
/**
 * Tests counter
 * @author Davyn
 */
public class CounterTest {
   
    public static boolean buildCounterTest(){
        
        boolean one= false, two=false , three=false;
        
        Item[] productShelf = MethodsForTesting.fillShelf();
        
        Cart cart1 = new Cart("Yenny");
        Cart cart2 = new Cart();
        Cart cart3 = new Cart();
        
        
        
        Counter counter1 = new Counter(new Employee("Yorgle"));
        counter1.addCart(cart3);
        counter1.addCart(cart1);
        counter1.addCart(cart2);
        
        if( counter1.front().equals(cart3) ){
            one = true;
        }
        
        counter1.removeCart();
        
        if( counter1.front().equals(cart1) ){
         two = true;
        }
        
        counter1.removeCart();
        
        if( counter1.front().equals(cart2) ){
            three = true;
        }
    
        return one && two && three;
    }
    

    
    
}
