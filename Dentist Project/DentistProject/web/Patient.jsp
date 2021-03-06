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
        <title>Patient</title>
        <center><nav>
        <h3>
        <a href="index.jsp">Home</a>
        <a href="login.jsp">Logout</a>
        </h3>
        </nav></center>
    </head>
    <% 
            Patient p1;
            session = request.getSession();
            p1 = (Patient)session.getAttribute("p1");    
            Appointment a1 = new Appointment(null, p1.getID(), null, null);
        %>    
    <body>
        <center><h1><%out.println("Welcome Patient " + p1.getFirstName() + " " + p1.getLastName() + "!");%></h1></center>
        <center><h3><a href="editInfoPatient.jsp">Edit Your Information</a></h3></center>
        <%
            a1.selectDB(p1.getID());
            if(a1.getCode() == null){             
        %>
        <center><h3><a href="addAppointment.jsp">View/Change Your Upcoming Appointment</a></h3></center><%}else{%>
        <center><h3><a href="editAppointment.jsp">View/Change Your Upcoming Appointment</a></h3></center><%}%>
    </body>
</html>
