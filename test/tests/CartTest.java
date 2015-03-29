/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import supermarket.*;
/**
 *
 * @author Davyn
 */
public class CartTest {
    
    
    
    /**
     * This tests the add and remove function of the cart as well as testing to
     * see if removing an item not in the cart is safe.
     * @return True if all aspects of the test pass. 
     */
    public static boolean testAddandRemove(){
        
        boolean one = false, two = false, three = false;
        
        
        Cart testCart1 = new Cart("Carl");
        Item orange = new Item("Orange", 3, false);
        Item lime = new Item("Lime", 3, false);
        testCart1.addItem(orange);
        testCart1.addItem(orange);
        testCart1.addItem(lime);
        
        if( testCart1.returnItem(orange).getNumber() == 2 ){
            one = true;
        }
        
        if( testCart1.returnItem(lime).getNumber() == 1 ){
            two = true;
        }
        
        testCart1.removeItem(lime);
        testCart1.removeItem(lime);
        
        if( testCart1.returnItem(lime) == null ){
           three = true; 
        }
        
        
      
        return (one && two && three) ;
    }
    
    
    
}
