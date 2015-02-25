/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 * @class CPSC 281
 * @author Davyn
 */
public class Item {
    private String name;
    private long id;
    private int price;
    
    public Item(String name, long id, int price){
        this.id = id;
        this.name = name;
        this.price = price;
     
    }
}
