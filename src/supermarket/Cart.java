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
   

    
   // private final Stack<Item> bills;
    private ArrayList<Pair>     cartArray = new ArrayList<Pair>();
    public String myName;
    
    public Cart(String myName){
        this.myName = myName;
        //bills = new Stack();
    }
    
    public Cart(){
        //Allows the creation of carts operated by nameless drones.
    }
    
    /**
     * 
     * @param item 
     */
    public void addItem(Item item){
        boolean alreadyIn = false;
        
        for( Pair anItem : cartArray){
           if( (anItem.getItem()).equals(item) ){
               alreadyIn = true;
               anItem.incrementNumber();
               
           }
        }       
        
        if(!alreadyIn){
            cartArray.add(new Pair(item));
        }
        
       
    }
    
    /**
     * Returns a pair of the users choosing.
     * @param item
     * @return 
     */
    public Pair returnItem(Item item){
        Pair pairItem = null;
        
        if(!cartArray.isEmpty()){
            for( Pair pair : cartArray ){
                if( pair.getItem().equals(item) ){
                    pairItem = pair;
                }

            }
        }
        return pairItem;
    }
    
  
    /**
     * 
     * @param item 
     */
    public void removeItem(Item item){
        Pair myPair = null;
        
        for(Pair pair : cartArray){
            
            if( pair.getItem().equals(item) ){
                if( pair.getNumber() > 1 ){
                    pair.decrementNumber();
                }else{
                //cartArray.remove(pair);
                    myPair = pair;
                }
            }
        }
        cartArray.remove(myPair);
        
        
    }
    
    /**
     * Cycles through array and prints name of item and the amount of that item.
     */
    public void cycle(){
        for(Pair pair : cartArray){
            System.out.println(pair.getItem().returnName()+": "+pair.getNumber());
        }
    }
    
    public ArrayList<Pair> getCart(){
        return this.cartArray;
    }
    
    /**
     * This subclass creates stores and item and the amount of that item inside
     * an object. Both this item can be seen through the methods provided.
     */
    public class Pair{
        
        private Item myItem;
        private int numberOf;
        
        public Pair(  Item item ){
            this.myItem = item;
            numberOf = 1;
        }
        
        public Item getItem(){
            return this.myItem;
        }
        
        public int getNumber(){
            return numberOf;
        }
        
        public void incrementNumber(){
            ++this.numberOf;
        }
        
        public void decrementNumber(){
            --this.numberOf;
        }
    }
}
