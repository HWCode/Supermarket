/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

/**
 *
 * @author Davyn
 */
public class Cart {
   

    
    private final Stack<Item> bills;
    private ArrayList<Item>     cartArray = new ArrayList<Item>();
    private ArrayList<Integer>  numArray = new ArrayList<Integer>();
    public String myName;
    
    public Cart(String myName){
        this.myName = myName;
        bills = new Stack();
    }
    
    public void addItem(Item item){
        boolean alreadyIn = false;
        
        for( Item anItem : cartArray){
           if( anItem.equals(item) ){
               alreadyIn = true;
           }
        }
        
        if(alreadyIn){
        
        }else{
            cartArray.add(item);
        }
    }
    
    public boolean detectDuplication(){
        return true;
    }
    
    public void removeItem(){
        cartArray.remove(0);
        numArray.remove(0);
    }
    

    
  
    
   
    
}
