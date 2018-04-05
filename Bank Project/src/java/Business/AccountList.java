package Business;

/*
 * Class: CIST 2373 Java III
 * Quarter: Fall 2017
 * Instructor: Ronald Enz
 * Description: ChattBank Project
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
import java.sql.*;
import java.util.*;
public class AccountList extends ArrayList {
    public static void main(String[] args){
        AccountList accountList = new AccountList();
        Account a1 = new Account("90004", "4003", "CHK", 500.00);
        Account a2 = new Account("90005", "4004", "CHK", 600.00);
        accountList.addAccount(a1);
        accountList.addAccount(a2);
        accountList.display();
    }
   
    public ArrayList<Account> AccountList = new ArrayList();
    
    public Account getAccount(int index){
        Account a1 = AccountList.get(index);
        return a1;
    }
    
    public void addAccount(Account a1){
        AccountList.add(a1);
    }
    @Override
    public int size(){
        return AccountList.size();
    }
    
    public void display(){
     for(int i = 0; i < AccountList.size(); i++){
         AccountList.get(i).display();
     }   
    }
}
