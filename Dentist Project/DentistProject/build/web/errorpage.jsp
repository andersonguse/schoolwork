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
        <title>Error Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <center><nav>
        <h3>
        <a href="index.jsp">Home</a>
        <a href="login.jsp">Login</a>
        </h3>
        </nav></center>
    </head>
    <body>
        <form action="LoginServlet" method="post">
        <% 
            Dentist d1;
            session = request.getSession();
            d1 = (Dentist)session.getAttribute("d1");           
        %>    
            <h1>
                 <% out.println("Error Logging in for User with ID " + d1.getID()); %>
            </h1>    
        </form>
    </body>
</html>
