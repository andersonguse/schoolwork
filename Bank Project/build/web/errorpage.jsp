<%@page import="Business.*"%>
<!DOCTYPE html>
<%--
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
 --%>
<html>
    <head>
        <title>Error Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="LoginServlet" method="post">
        <% 
            Customer c1;
            session = request.getSession();
            c1 = (Customer)session.getAttribute("c1");           
        %>    
            <h1>
                 <% out.println("Error Logging in for User with ID " + c1.getCustID()); %>
            </h1>    
        </form>
    </body>
</html>
