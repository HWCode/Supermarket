/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 * @class CPSC 281
 * @author Davyn
 * @version 1.0
 */
public class Item {
    private String name;
    private long id = 1000;
    private int price;
    private boolean recyclable;
    
    
            
    public Item(String name, int price, boolean recycle){
        this.id = id++;
        this.name = name;
        this.price = price;
        this.recyclable = recycle;
     
    }
    /**
     * Returns name of product
     * @return Returns string
     */
    public String returnName(){
        return name;
    }
    /**
     * Returns id number product
     * @return 
     */
    public long returnId(){
        return id;
    }
    
    
    public boolean isRecyclable(){
        return this.recyclable;
    }
    
    /**
     * Returns the price of the product
     * @return 
     */
    public int returnPrice(){
        return price;
    }
}
