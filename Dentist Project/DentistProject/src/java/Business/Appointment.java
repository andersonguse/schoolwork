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
import java.util.*;
import java.sql.*;
public class Appointment {
    public static void main(String[] args){
        Appointment a1 = new Appointment();
        try{
        a1.deleteDB("A911");
        //a1.insertDB("May 5, 2018, 9am", "A911 ", "D201 ", "P114");
        //a1.selectDB("A911");
        //a1.updateDB("May 5, 2018, 10am", "A911 ", "D202 ", "P114");
        //a1.deleteDB("A911");
        //a1.selectDB("A911");
        }
        catch(SQLException | ClassNotFoundException ex){}
        a1.display();
    }
    public String apptDateTime;
    public String patID;
    public String dentID;
    public String code;
    
    Appointment(){}
    
    public Appointment(String apptDateTime, String patID, String dentID, String code){
        this.apptDateTime = apptDateTime;
        this.patID = patID;
        this.dentID = dentID;
        this.code = code;
    }
    public void setApptDateTime(String apptDateTime){
        this.apptDateTime = apptDateTime;
    }
    public void setPatID(String patID){
        this.patID = patID;
    }
    public void setDentID(String dentID){
        this.dentID = dentID;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getApptDateTime(){
        return apptDateTime;
    }
    public String getPatID(){
        return patID;
    }
    public String getDentID(){
        return dentID;
    }
    public String getCode(){
        return code;
    }
    public void selectDB(String patId) throws SQLException, ClassNotFoundException{
       String sql = ("select * from Appointments where patId = '" + patId + "'");
       Statement statement;
       ResultSet resultSet;
       try{
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
       statement = connection.createStatement();
       resultSet = statement.executeQuery(sql);
       resultSet.next();
       apptDateTime = resultSet.getString(1);
       patID = resultSet.getString(2);
       dentID = resultSet.getString(3);
       code = resultSet.getString(4);
       
       }
       catch(SQLException | ClassNotFoundException ex){}
   }
    public void insertDB(String apptDateTime, String patID, String dentID, String code)throws SQLException, ClassNotFoundException{
        String sql = ("insert into Appointments values ('" + apptDateTime + "', '" + patID + "', '"
                + dentID + "', '" + code + "');");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void deleteDB(String patId)throws SQLException, ClassNotFoundException{
        String sql = ("delete from Appointments where patId = '" + patId + "'");
        Statement statement;
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/ander/Downloads/DentistOfficeMDB.mdb");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex){}
    }
    public void updateDB(String apptDateTime, String patID, String dentID, String code)throws SQLException, ClassNotFoundException{
        String sql = ("update Appointments set apptDateTime = '" + apptDateTime + "', patId = '" +
                patID + "', dentId = '" + dentID + "', procCode = '" + code + "' where patId = '" + this.patID + "'");
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
        System.out.println("Appointment Date/Time = " + apptDateTime);
        System.out.println("Patient ID = " + patID);
        System.out.println("Dentist ID = " + dentID);
        System.out.println("Code = " + code);
    }
}
