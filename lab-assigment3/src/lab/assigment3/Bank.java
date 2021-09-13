/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assigment3;

/**
 *
 * @author S545702
 */
public class Bank {
    private int number;
    private double balance;
    private String customerName;
    private String phoneNumber;

//default constructor
public Bank(){   
    System.out.println("Empty constructor called");
}
public Bank(int number, double balance, String customerName, String phoneNumber){
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.phoneNumber = phoneNumber;
    System.out.println("Account constructor parameters called");
}
public void setNumber(){
    this.number = number;
}
public int getnumber(){
    return number;
}
public void setbalance(double balance){
    this.balance = balance;
}
public void updateBalance(double balance){
    balance += balance;
}
public double getbalance(){
    return balance;
}
public void setCustomerName(){
    this.customerName = customerName;
}
public String getCustomerName(){
    return customerName;
}
public void setPhoneNumber(){
    this.phoneNumber = phoneNumber;
}
public String phoneNumber(){
    return phoneNumber = phoneNumber;
}
public String ToString(){
    return "Number: " + number + " \nBalance: " + balance + "\nCustomerName: " + customerName + "\nPhoneNumber: " + phoneNumber;
}









}