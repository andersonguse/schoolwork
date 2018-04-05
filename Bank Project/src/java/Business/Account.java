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
public class Account {
    
    public static void main(String[] args){
        Account a1 = new Account();
        try{
        a1.selectDB("3001");}
        catch(SQLException | ClassNotFoundException ex){}
        a1.deposit(300.00);
        a1.display();
    }
   public String AcctNo;
   public String Cid;
   public String Type;
   public double Balance;
   
   Account(){}
   
   public Account(String AcctNo, String Cid, String Type, double Balance){
       this.AcctNo = AcctNo;
       this.Cid = Cid;
       this.Type = Type;
       this.Balance = Balance;
   }
   public String getAcctNo(){
       return AcctNo;
   }
   public String getCid(){
       return Cid;
   }
   public String getType(){
       return Type;
   }
   public double getBalance(){
       return Balance;
   }
   public void setAcctNo(String AcctNo){
       this.AcctNo = AcctNo;
   }
   public void setCid(String Cid){
       this.Cid = Cid;
   }
   public void setType(String Type){
       this.Type = Type;
   }
   public void setBalance(double Balance){
       this.Balance = Balance;
   }
   public void deposit(double amount){
       Balance += amount;
   }
   public void withdraw(double amount){
       Balance -= amount;
   }
   public void selectDB(String acctNo) throws SQLException, ClassNotFoundException{
       AcctNo = acctNo;
       String sql = ("select * from Accounts where AcctNo = '" + acctNo + "'");
       Statement statement;
       ResultSet resultSet;
       try{
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/ChattBankMDB.mdb");
       statement = connection.createStatement();
       resultSet = statement.executeQuery(sql);
       resultSet.next();
       AcctNo = resultSet.getString(1);
       Cid = resultSet.getString(2);
       Type = resultSet.getString(3);
       Balance = resultSet.getDouble(4);
       }
       catch(SQLException | ClassNotFoundException ex){}
   }
   public void display(){
       System.out.println("Account Number = " + AcctNo);
        System.out.println("Customer ID = " + Cid);
        System.out.println("Type = " + Type);
        System.out.println("Balance = " + Balance);
   }
}
