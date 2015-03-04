/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.ArrayList;
import supermarket.Cart.Pair;

/**
 *
 * @author Davyn
 */
public class Bill {
    
    private ArrayList<String> billArray = new ArrayList<String>();
    private int total;
    
    public Bill(ArrayList<Pair> pair){
        for(Pair pairs: pair){
            billArray.add(pairs.getItem().returnName());
            total += pairs.getNumber() * pairs.getItem().returnPrice();
        }
    
    }
}
