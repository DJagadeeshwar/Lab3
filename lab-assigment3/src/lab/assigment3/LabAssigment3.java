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
public class LabAssigment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank a= new Bank ();
        Bank bank= new Bank(123456, 1000, "jagadeesh", "8328624372");
        double mainbalance = bank.getbalance();
        System.out.println(bank.ToString());
        bank.setbalance(500.0);
        System.out.println("Deposit of "+ bank.getbalance() +" made");
        double finalbal = bank.getbalance() + mainbalance;
        System.out.println("New balance is "+finalbal);
        double withdraw = 500.0;
        double finalbal2 = finalbal - withdraw;
        bank.setbalance(finalbal2);
        System.out.println("withdraw of 500 processed," + " Remaining Balance " + finalbal2);
        System.out.println("To Sring Called" + "\n" +bank.ToString());

        
        
    }
    
}