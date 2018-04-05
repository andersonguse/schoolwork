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
public class Customer {
    public static void main(String[] args){
        Customer c1 = new Customer();
        try{
        c1.selectDB("3001");
        c1.getAccounts();
        }
        catch(SQLException | ClassNotFoundException ex){}
        System.out.println("Size = " + c1.customerList.size());
    }
    public String CustID;
    public String CustPassword;
    public String CustFirstName;
    public String CustLastName;
    public String CustAddress;
    public String CustEmail;
    public AccountList customerList = new AccountList();
    
    Customer(){}
    
    public Customer(String CustID, String CustPassword, String CustFirstName,
    String CustLastName, String CustAddress, String CustEmail){
        this.CustID = CustID;
        this.CustPassword = CustPassword;
        this.CustFirstName = CustFirstName;
        this.CustLastName = CustLastName;
        this.CustAddress = CustAddress;
        this.CustEmail = CustEmail;
    }
    public String getCustID(){
        return CustID;
    }
    public String getCustPassword(){
        return CustPassword;
    }
    public String getCustFirstName(){
        return CustFirstName;
    }
    public String getCustLastName(){
        return CustLastName;
    }
    public String getCustAddress(){
        return CustAddress;
    }
    public String getCustEmail(){
        return CustEmail;
    }
    public AccountList getCustomerList(){
        return customerList;
    }
    public void setCustID(String CustID){
        this.CustID = CustID;
    }
    public void setCustPassword(String CustPassword){
        this.CustPassword = CustPassword;
    }
    public void setCustFirstName(String CustFirstName){
        this.CustFirstName = CustFirstName;
    }      
    public void setCustLastName(String CustLastName){
        this.CustLastName = CustLastName;
    }       
    public void setCustAddress(String CustAddress){
        this.CustAddress = CustAddress;
    }
    public void setCustEmail(String CustEmail){
        this.CustEmail = CustEmail;
    }   
    public void selectDB(String id) throws SQLException, ClassNotFoundException{
        this.CustID = id;
        String sql = ("select * from Customers where CustID = '" + id + "'");
        Statement statement;
        ResultSet resultSet;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/ChattBankMDB.mdb");
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        resultSet.next();
        CustID = resultSet.getString(1);
        CustPassword = resultSet.getString(2);
        CustFirstName = resultSet.getString(3);
        CustLastName = resultSet.getString(4);
        CustAddress = resultSet.getString(5);
        CustEmail = resultSet.getString(6);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public static void insertDB(String custID, String custPassword, String custFirstName,
    String custLastName, String custAddress, String custEmail){
        String sql = ("insert into Customers values ('" + custID + "', '" + custPassword + "', '"
                + custFirstName + "', '" + custLastName + "', '" + custAddress + "', '"
                + custEmail + "');");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/ChattBankMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public static void deleteDB(String custID){
        String sql = ("delete from Customers where CustID = '" + custID + "'");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/ChattBankMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void display(){
        System.out.println("ID = " + CustID);
        System.out.println("Password = " + CustPassword);
        System.out.println("First name = " + CustFirstName);
        System.out.println("Last name = " + CustLastName);
        System.out.println("Address = " + CustAddress);
        System.out.println("Email = " + CustEmail);
    }
    public void getAccounts()throws SQLException, ClassNotFoundException {
        String sql = "select * from Accounts where Cid = '" + CustID + "'";
        Statement statement;
        ResultSet resultSet;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/ChattBankMDB.mdb");
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Account a1 = new Account();
                a1.setAcctNo(resultSet.getString(1));
                a1.setCid(resultSet.getString(2));
                a1.setType(resultSet.getString(3));
                a1.setBalance(resultSet.getDouble(4));
                customerList.addAccount(a1);
            } 
            customerList.display();
        }
        catch(SQLException | ClassNotFoundException ex){}    
    }
}
