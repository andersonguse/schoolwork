/**
 * Class: CIST 2372 Java II
 * Quarter: Fall 2017
 * Instructor: Dave Busse
 * Description: Unit 02 Lab
 * Date: Due September 10th, 2017
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
package unit02;
import java.util.Scanner;
public class AccountTester {
    public static void main(String[] args) {
         Account myAccount = new Account();
        try{
            myAccount.setBalance(200);
           System.out.println("Account object created with balance of " + myAccount.getBalance());
           System.out.println("Withdrawing 100.");
           myAccount.withdraw(100);
           System.out.println("Balance after withdrawal of 100 is: " + myAccount.getBalance());
           System.out.println("Depositing 50.");
           myAccount.deposit(50);
           System.out.println("Balance after deposit of 50 is: " + myAccount.getBalance());
           System.out.println("Withdrawing 500.");
           myAccount.withdraw(500);          
       }
        catch(InsufficientFundsException ex){
           System.out.println("Error: Overdrawn");
       }   
        try{
          System.out.println("Balance is: " + myAccount.getBalance());  
           System.out.println("Setting balance to -100.");
           myAccount.setBalance(-100);  
        }           
       catch(InsufficientFundsException ex){
           System.out.println("Error: Overdrawn");
       } 
        System.out.println("Balance is: " + myAccount.getBalance());
    }   
}
