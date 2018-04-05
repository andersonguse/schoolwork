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
public class Patient {
    public static void main(String[] args){
        Patient p1 = new Patient();
        try{
            //p1.insertDB("A912 ", "4444", "Anderson", "Guse", "Dallas", "aguse@gmail.com", "Blue Cross");
            //p1.deleteDB("A912");
            //p1.selectDB("A912");
            //p1.updateDB("Bruno", "Guse", "Hiram", "bguse@gmail.com", "Cigna");
            p1.selectDB("A900");
        }
        catch(SQLException | ClassNotFoundException ex){}
        p1.display();
        
    }
    public String id;
    public String password;
    public String firstName;
    public String lastName;
    public String address;
    public String email;
    public String insuranceco;
    
    Patient(){}
    
    public Patient(String id, String password, String firstName, String lastName, String address, String email, String insuranceco){
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.insuranceco = insuranceco;
    }
    public void setID(String id){
        this.id = id;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setInsuranceCo(String insuranceco){
        this.insuranceco = insuranceco;
    }
    public String getID(){
        return id;
    }
    public String getPassword(){
        return password;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getInsuranceCo(){
        return insuranceco;
    }
    public void selectDB(String ID) throws SQLException, ClassNotFoundException{
       id = ID;
       String sql = ("select * from Patients where patId = '" + ID + "'");
       Statement statement;
       ResultSet resultSet;
       try{
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
       statement = connection.createStatement();
       resultSet = statement.executeQuery(sql);
       resultSet.next();
       id = resultSet.getString(1);
       password = resultSet.getString(2);
       firstName = resultSet.getString(3);
       lastName = resultSet.getString(4);
       address = resultSet.getString(5);
       email = resultSet.getString(6);
       insuranceco = resultSet.getString(7);
       }
       catch(SQLException | ClassNotFoundException ex){}
   }
    public void insertDB(String id, String password, String firstName, String lastName, String address, String email, String insuranceco)throws SQLException, ClassNotFoundException{
        String sql = ("insert into Patients values ('" + id + "', '" + password + "', '"
                + firstName + "', '" + lastName + "', '" + address + "', '"
                + email + "', '" + insuranceco + "');");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void deleteDB(String id)throws SQLException, ClassNotFoundException{
        String sql = ("delete from Patients where patId = '" + id + "'");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void updateDB(String firstName, String lastName, String address, String email, String insuranceco)throws SQLException, ClassNotFoundException{
        String sql = ("update Patients set firstName = '" + firstName + "', lastName = '" +
                lastName + "', addr = '" + address + "', email = '" + email + "', insCo = '" + insuranceco + "' where patId = '" + id + "'");
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
        System.out.println("ID = " + id);
        System.out.println("Password = " + password);
        System.out.println("First name = " + firstName);
        System.out.println("Last name = " + lastName);
        System.out.println("Address = " + address);
        System.out.println("Email = " + email);
        System.out.println("Insurance company = " + insuranceco);
    }
}
