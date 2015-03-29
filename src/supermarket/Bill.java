/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import supermarket.Cart.Pair;

/**
 * 
 * @author Davyn
 */
public class Bill {
    
    private ArrayList<Pair> billArray;
    private double total;
    private Employee myCashier;
    private int counterNumber;
    private String time;
    
    public Bill(ArrayList<Pair> pair, int counterNum, Employee emp){
        
        this.counterNumber = counterNum;
        this.myCashier = emp;
        this.time = getTime();
        this.billArray = pair;
        
        for(Pair pairs: pair){
            total += pairs.getNumber() * pairs.getItem().returnPrice();
            specialOffer(pairs);
            recycleFee(pairs);
        }
    
    }
    
    /**
     * Finds time of bills creation
     * @return The time the bill was created in a string format
     */
    public String getTime(){
        Calendar calendar = Calendar.getInstance();
        //calendar.getTime();
        SimpleDateFormat timeOfCharge = new SimpleDateFormat("HH:mm:ss");
        
        return timeOfCharge.format(calendar.getTime());
    }
    
    /**
     * Prints out bill.
     */
    public void printBill(){
        
        System.out.println("Cashier's name:  " + myCashier.getName());
        System.out.println("Cashier's id:    " + myCashier.getId() );
        System.out.println("Time of billing: " + time);
        System.out.println();
        
        for(Pair pairs: this.billArray){
            System.out.println(pairs.getItem().returnName() + " " + pairs.getNumber());
        }
    
        System.out.println("Total Bill: " + total);
        System.out.println("------------------");
    }
    
    /**
     * Applies special offer of buy 2 or more Cola and get one half price.
     * @param pair 
     */
    public void specialOffer(Pair pair){
        if( (pair.getItem().returnName().equals("Cola")) && (pair.getNumber()>=2) ){
            total -=  pair.getItem().returnPrice();
        }
    
    }
    
    /**
     * For every item that is recyclable, a deposit of 0.10 is applied
     * @param pair 
     */
    public void recycleFee(Pair pair){
        if( pair.getItem().isRecyclable() ){
            total += 0.10 * pair.getNumber();
        }
    }
    /**
     * 
     * @return Total cost of bill. 
     */
    public double getTotal(){
        return total;
    }
}
