/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import supermarket.*;
/**
 * This class contains methods that were found to be useful for testing.
 * @author Davyn
 */
public class MethodsForTesting {
    
    /**
     * This method fills a shelf with items for testing purposes
     * @return Item array 
     */
    public static Item[] fillShelf(){
        Item[] product = new Item[9];
        product[0] = new Item( "Orange", 2, false );
        product[1] = new Item( "Strawberry", 4, false );
        product[2] = new Item( "Lime", 1 ,false );
        
        product[3] = new Item( "Pork",10 ,false  );
        product[4] = new Item( "Beef",12 ,false  );
        product[5] = new Item( "Veggie Burger",14 ,false  );
        
        product[6] = new Item( "Cola",2 ,true  );
        product[7] = new Item( "Orange Pop",2 ,true  );
        product[8] = new Item( "Carbinated water",3 ,true  );    
        
        return product;
    }
    
}
