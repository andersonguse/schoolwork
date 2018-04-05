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
public class AppointmentList extends ArrayList {
    public static void main(String[] args){
        AppointmentList alist = new AppointmentList();
        Appointment a1 = new Appointment("May 5, 2018, 9am", "A911 ", "D201 ", "P114");
        Appointment a2 = new Appointment("May 6, 2018, 10am", "A912 ", "D201 ", "P114");
        alist.addAppointment(a1);
        alist.addAppointment(a2);
        alist.display();
    }
    public ArrayList<Appointment> AppointmentList = new ArrayList();
    
    public Appointment getAppointment(int index){
        Appointment a1 = AppointmentList.get(index);
        return a1;
    }
    public void addAppointment(Appointment a1){
        AppointmentList.add(a1);
    }
    @Override
    public int size(){
        return AppointmentList.size();
    }
    public void display(){
     for(int i = 0; i < AppointmentList.size(); i++){
         AppointmentList.get(i).display();
     }   
    }
}
