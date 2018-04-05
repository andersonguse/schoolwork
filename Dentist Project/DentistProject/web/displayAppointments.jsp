<%--
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
 --%>
 <%@page import="Business.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Appointments</title>
        <style>
            table, th, td{border: 1px solid black;}    
        </style>
        <center><nav>
        <h3>
        <a href="index.jsp">Home</a>
        <a href="login.jsp">Logout</a>
        <a href="Dentist.jsp">Go Back</a>
        </h3>
        </nav></center>
    </head>
    <% 
            Dentist d1;
            session = request.getSession();
            d1 = (Dentist)session.getAttribute("d1"); 
            d1.getAppointments();
        %> 
    <body>
        <center><h1>These are your upcoming appointments, dentist.</h1></center>
        <center><table>
            <tr>
                <th>Date/Time</th>
                <th>Patient ID</th>
                <th>Procedure Code</th>
            </tr>
            <%
                for(int i = 0; i < d1.appointmentList.size(); i++){
                  Appointment a1 = d1.appointmentList.getAppointment(i);  
            %>
            <tr>
                <td><%=a1.getApptDateTime()%></td>
                <td><%=a1.getPatID()%></td>
                <td><%=a1.getCode()%></td>          
            </tr>
            <%
                }
            %>
        </table></center>
    </body>
</html>
