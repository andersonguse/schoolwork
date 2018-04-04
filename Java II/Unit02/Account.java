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
import java.util.Scanner;

public class Account {
    
    private int acctNo;
    private String owner;
    private int balance;
    Scanner input = new Scanner(System.in);
    
    public Account(){}
    
    public Account(int no, String own, int bal){
        this.acctNo = no;
        this.owner = own;
        this.balance = bal;
    }
    public void setAcctNo(int acctNo){
        this.acctNo = acctNo;
    }
    public int getAcctNo(){
        return acctNo;
    }
    public void setOwner (String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    public void setBalance(int balance) throws InsufficientFundsException{
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            throw new InsufficientFundsException("Error: insufficient funds");
        }
    }
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amt) throws InsufficientFundsException{
        if(amt <= balance){ 
            balance = balance - amt;
        }
        else{
           throw new InsufficientFundsException("Error: Overdrawn");
        }
    }
    public void deposit(int amt){
        balance = balance + amt; 
    }   
}