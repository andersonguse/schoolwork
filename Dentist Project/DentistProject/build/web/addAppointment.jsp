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
<%@page import="Business.Appointment"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Appointment</title>
        <style>
            table, th, td{border: 1px solid black;}    
        </style>
        <center><nav>
        <h3>
        <a href="index.jsp">Home</a>
        <a href="login.jsp">Logout</a>
        <a href="Patient.jsp">Go Back</a>
        </h3>
        </nav></center>
    </head>
    <body>
    <center><h1>You do not have a current appointment. If you would like to, <br>
        please add an appointment below.</h1></center>
    <center><h2>Please follow the following format when entering a date/time:<br>
        Month day, year, time. For Example: January 1, 2000, 9am</h2>
    <form action="AddAppointmentServlet" method="post">
        <center><table>
            <tr>
                <td><label for="apptDateTime">Date/Time:</label></td>
                <td><input type="Text" name="apptDateTime"/></td>
            </tr>
            <tr>
                <td><label for="dentists">Dentist:</label></td>
                <td><select name="dentists">
                    <option value="selectone1">Select One</option>
                    <option value="D201 ">Frank Martin</option>
                    <option value="D202 ">Susan Cassidy</option>
                    <option value="D203 ">Jerry York</option>
                    <option value="D204 ">Wayne Pattersen</option
                    </select></td>
            </tr>
            <tr>
                <td><label for="procedure">Procedure:</label></td>
                <td><select name="procedure">
                    <option value="selectone2">Select One</option>
                    <option value="P114">Cleaning/Exam</option>
                    <option value="P119">Xrays</option>
                    <option value="P122">Whitening</option>
                    <option value="P321">Cavity</option>>
                    <option value="P650">Top Dentures</option>
                    <option value="P660">Bottom Dentures</option>
                    <option value="P780">Crown</option>
                    <option value="P790">Root Canel</option>
                    </select></td>
            </tr>
            <tr>
            <tr>
                <td><input type="submit" name="submit" value="Submit Changes"/></td>
                <td><input type="reset" name="clear" value="Clear"/></td>
            </tr>
        </table></center>
        </form>
    </body>
</html>
