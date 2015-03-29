/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import supermarket.*;
/**
 * This class builds a supermarket market and utilizes all it's functions.
 * @author Davyn
 */
public class Simulation {
    
    public static void main(String[] args){
        //Tests Cart and Counter
        System.out.println( "CartTest: " + CartTest.testAddandRemove() + " CounterTest: " + CounterTest.buildCounterTest());
        SupermarketSimulation();
    }
    
    /**
     * Builds and runs simulations from beginning to end.
     */
    public static void SupermarketSimulation(){
        //Calls method to stock shelves.
        Item[] shelf = MethodsForTesting.fillShelf();
    
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Cart cart3 = new Cart();
        
        fillCart(cart1, 2);
        fillCart(cart2, 4);
        fillCart(cart3, 5);
        
        Counter counter1 = new Counter( new Employee("Boris") );
        
        counter1.addCart(cart1);
        counter1.addCart(cart2);
        counter1.addCart(cart3);
        
        counter1.removeCartAndBill();
        counter1.removeCartAndBill();
        counter1.removeCartAndBill();
        
    }
     
    /**
     * Fills carts with semi-random items.
     * @param cart
     * @param number 
     */
    
    public static void fillCart(Cart cart, int number){
        
        Item[] shelf = MethodsForTesting.fillShelf();
        
        int random =  (int) (Math.random()*9) ;
        cart.addItem( shelf[ (number +1)%9 ] );
        cart.addItem( shelf[ (number +0)%9 ] );
        cart.addItem( shelf[ (number +1)%9 ] );
        cart.addItem( shelf[ (random) ] );
    
    }
    
}
