/**
 * Class: CIST 2373 Java III
 * Quarter: Spring 2018
 * Instructor: Ronald Enz
 * Description: Dentist Project
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
package Business;
import java.sql.*;
import java.util.*;
public class Procedure {
    public static void main(String[]args){
        Procedure p1 = new Procedure();
        try{
        //p1.insertDB("P800", "New tooth", "Replacing a whole tooth.", 2000.00);
        //p1.selectDB("P800");
        //p1.updateDB("Brand new tooth", "replacing the whole thang", 2020.00);
        p1.deleteDB("P800");
        //p1.selectDB("P114");
        }
        catch(SQLException | ClassNotFoundException ex){}
        p1.display();
    }
    public String code;
    public String name;
    public String description;
    public double cost;
    
    Procedure(){}
    
    public Procedure(String code, String name, String description, double cost){
        this.code = code;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getCost(){
        return cost;
    }
    public void selectDB(String code) throws SQLException, ClassNotFoundException{
       this.code = code;
       String sql = ("select * from Procedures where procCode = '" + code + "'");
       Statement statement;
       ResultSet resultSet;
       try{
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
       statement = connection.createStatement();
       resultSet = statement.executeQuery(sql);
       resultSet.next();
       this.code = resultSet.getString(1);
       name = resultSet.getString(2);
       description = resultSet.getString(3);
       cost = resultSet.getDouble(4);
       }
       catch(SQLException | ClassNotFoundException ex){}
   }
    public void insertDB(String code, String name, String description, double cost)throws SQLException, ClassNotFoundException{
        String sql = ("insert into Procedures values ('" + code + "', '" + name + "', '"
                + description + "', '" + cost + "');");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void deleteDB(String code)throws SQLException, ClassNotFoundException{
        String sql = ("delete from Procedures where procCode = '" + code + "'");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void updateDB(String name, String description, double cost)throws SQLException, ClassNotFoundException{
        String sql = ("update Procedures set procName = '" + name + "', procDesc = '" +
                description + "', cost = " + cost + " where procCode = '" + code + "'");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void display(){
        System.out.println("Code = " + code);
        System.out.println("Name = " + name);
        System.out.println("Description = "+ description);
        System.out.println("Cost = " + cost);
    }
}
