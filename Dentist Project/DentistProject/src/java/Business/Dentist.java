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
public class Dentist {
    public static void main(String[] args){
        Dentist d1 = new Dentist();
        try{
        d1.selectDB("D201");
        //d1.insertDB("D205 ", "4444", "Anderson", "Guse", "aguse@gmail.com", "553");
        //d1.deleteDB("D205");
        //d1.selectDB("D205");
        //d1.updateDB("Bruno", "Guse", "bguse@gmail.com", "559");
        //d1.selectDB("D205");
        d1.getAppointments();
        }
        catch(SQLException | ClassNotFoundException ex){}
        d1.display();
    }
    public String id;
    public String password;
    public String firstName;
    public String lastName;
    public String email;
    public String office;
    public AppointmentList appointmentList = new AppointmentList();
    
    Dentist(){}
    
    public Dentist(String id, String password, String firstName, String lastName, String email, String office){
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.office = office;
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
    public void setEmail(String email){
        this.email = email;
    }
    public void setOffice(String office){
        this.office = office;
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
    public String getEmail(){
        return email;
    }
    public String getOffice(){
        return office;
    }
    public void getAppointments()throws SQLException, ClassNotFoundException{
        String sql = "select * from Appointments where dentId = '" + id + "'";
        Statement statement;
        ResultSet resultSet;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Appointment a1 = new Appointment();
                a1.setApptDateTime(resultSet.getString(1));
                a1.setPatID(resultSet.getString(2));
                a1.setDentID(resultSet.getString(3));
                a1.setCode(resultSet.getString(4));
                appointmentList.addAppointment(a1);
            } 
            appointmentList.display();
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void selectDB(String ID) throws SQLException, ClassNotFoundException{
       id = ID;
       String sql = ("select * from Dentists where id = '" + ID + "'");
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
       email = resultSet.getString(5);
       office = resultSet.getString(6);
       }
       catch(SQLException | ClassNotFoundException ex){}
   }
    public void insertDB(String id, String password, String firstName, String lastName, String email, String office)throws SQLException, ClassNotFoundException{
        String sql = ("insert into Dentists values ('" + id + "', '" + password + "', '"
                + firstName + "', '" + lastName + "', '" + email + "', '"
                + office + "');");
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
        String sql = ("delete from Dentists where id = '" + id + "'");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void updateDB(String firstName, String lastName, String email, String office)throws SQLException, ClassNotFoundException{
        String sql = ("update Dentists set firstName = '" + firstName + "', lastName ='" +
                lastName + "', email = '" + email + "', office = '" + office + "' where id = '" + id + "'");
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
        System.out.println("Email = " + email);
        System.out.println("Office = " + office);
    }
}
