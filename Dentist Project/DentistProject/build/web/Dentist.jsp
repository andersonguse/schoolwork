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
        <title>Dentist</title>
        <center><nav>
        <h3>
        <a href="index.jsp">Home</a>
        <a href="login.jsp">Logout</a>
        </h3>
        </nav></center>
    </head>
    <% 
            Dentist d1;
            session = request.getSession();
            d1 = (Dentist)session.getAttribute("d1");           
        %>    
    <body>
        <center><h1><%out.println("Welcome Dentist " + d1.getFirstName() + " " + d1.getLastName() + "!");%></h1></center>
        <center><h3><a href="editInfoDentist.jsp">Edit Your Information</a></h3></center>
        <center><h3><a href="displayAppointments.jsp">View Your Upcoming Appointments</a></h3></center>
    </body>
</html>
