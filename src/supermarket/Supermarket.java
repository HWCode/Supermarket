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
public class Supermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item orange   = new Item( "Orange", 3 , false);
        Item lime     = new Item( "Lime  ", 2 , false); 
        Item candy    = new Item( "Pop ", 300, true);
        
        Cart cart   =    new Cart("Carl1");
        Cart cart1  =    new Cart("Carl2");
        Cart cart2  =    new Cart("Carl3");        
        
        cart.addItem(candy);
        cart.addItem(orange);
        cart.addItem(lime);
        cart.addItem(lime);
        cart.addItem(lime);
        cart.addItem(lime);
        cart.addItem(orange);
        cart.removeItem(lime);
        cart.removeItem(orange);
        cart.addItem(candy);
        
        
        Counter counter = new Counter(new Employee("James"));

        counter.addCart(cart);
        counter.addCart(cart1);
        counter.addCart(cart2);
        
       counter.removeCartAndBill();
       //cart.cycle();
       //System.out.println(counter.front().myName + " ");
        
        
        
    }
    
}
