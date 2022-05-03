/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;
    private int id;
    private String currency;
    private ArrayList<ATM> cards;
    
    
    public Customer(String name,double balance,int id,String currency){
        this.id         = id;
        this.name       = name;
        this.balance    = balance;
        this.currency   = currency;
                
    }
    
    public void setCustomerName(String name){
        this.name = name;
    } 
    
    public void setCustomerSalary(double balance){
        this.balance = balance;
        
    } 
    
    public String getCustomerName(){
        return this.name;
    } 
    
    public double getCustomerSalary(){
        return this.balance;
    } 
    
    public String toString(){
        return "Customer Id Is : "+id+" , Name : "+name+" Balance : "+balance+"Currence : "+currency;
    }
    public String withdraw(double b){
        if(b<=balance){
            balance-=b;
            return "Done!";
        }
        return "Error";
    }
    
    public String depose(double b){
        balance+=b;
        return "Done!";
    }
    public void addCard(int num,int pin){
        ATM atm = new ATM(num,pin);
        cards.add(atm);
    }
}
