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
        <title>Edit Patient Info</title>
        <center><nav>
        <h3>
        <a href="index.jsp">Home</a>
        <a href="login.jsp">Logout</a>
        <a href="Patient.jsp">Go Back</a>
        </h3>
        </nav></center>
    </head>
    <% 
            Patient p1;
            session = request.getSession();
            p1 = (Patient)session.getAttribute("p1");           
        %>    
    <body>
        <center><h1>Edit your information, patient.</h1></center>
        <form action="EditPatientInfoServlet" method="post">
        <center><table>
            <tr>
                <td><label for="fname">First name:</label></td>
                <td><input type="Text" name="fname" value="<%=p1.getFirstName()%>"/></td>
            </tr>
            <tr>
                <td><label for="lname">Last name:</label></td>
                <td><input type="Text" name="lname" value="<%=p1.getLastName()%>"/></td>
            </tr>
            <tr>
                <td><label for="address">Address:</label></td>
                <td><input type="Text" name="address" value="<%=p1.getAddress()%>"/></td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td><input type="Text" name="email" value="<%=p1.getEmail()%>"/></td>
            </tr>
            <tr>
                <td><label for="insuranceco">Insurance Company:</label></td>
                <td><input type="Text" name="insuranceco" value="<%=p1.getInsuranceCo()%>"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="Submit Changes"/></td>
                <td><input type="reset" name="clear" value="Clear"/></td>
            </tr>
        </table></center>
        </form>
    </body>
</html>
