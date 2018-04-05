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
        <title>Edit Appointment</title>
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
    <%
        Patient p1;
        session = request.getSession();
        p1 = (Patient)session.getAttribute("p1");
        Appointment a1 = new Appointment("", p1.getID(), "", "");
        a1.selectDB(p1.getID());
        Dentist d1 = new Dentist(a1.getDentID(), "", "", "", "", "");
        d1.selectDB(a1.getDentID());
        Procedure proc1 = new Procedure(a1.getCode(), "", "", 0.00);
        proc1.selectDB(a1.getCode());
        session.setAttribute("a1", a1);
    %>
    <body>
        <center><h1>This is your current appointment.</h1></center>
        <center><h3><table>
                <tr>
                    <th>Date/Time</th>
                    <th>Dentist</th>
                    <th>Procedure</th>
                </tr>
                <tr>
                    <td><%=a1.getApptDateTime()%></td>
                    <td><%=d1.getFirstName()%> <%=d1.getLastName()%></td>
                    <td><%=proc1.getName()%></td>
                </tr>
        </table></h3></center>
        <center><h1>If you would like to change your appointment, please do so below.<br>
            If not, just leave the information as it is.</h1></center>
        <form action="EditAppointmentServlet" method="post">
        <center><table>
            <tr>
                <td><label for="apptDateTime">Date/Time:</label></td>
                <td><input type="Text" name="apptDateTime" value="<%=a1.getApptDateTime()%>"/></td>
            </tr>
            <tr>
                <td><label for="dentists">Dentist:</label></td>
                <td><select name="dentists">
                    <%if(d1.getID().equals("D201 ")){%><option value="D201 " selected>Frank Martin</option><%}else{%>
                    <option value="D201 ">Frank Martin</option><%}%>
                    <%if(d1.getID().equals("D202 ")){%><option value="D202 " selected>Susan Cassidy</option><%}else{%>
                    <option value="D202 ">Susan Cassidy</option><%}%>
                    <%if(d1.getID().equals("D203 ")){%><option value="D203 " selected>Jerry York</option><%}else{%>
                    <option value="D203 ">Jerry York</option><%}%>
                    <%if(d1.getID().equals("D204 ")){%><option value="D204 " selected>Wayne Pattersen</option><%}else{%>
                    <option value="D204 ">Wayne Pattersen</option><%}%>
                    </select></td>
            </tr>
            <tr>
                <td><label for="procedure">Procedure:</label></td>
                <td><select name="procedure">
                    <%if(a1.getCode().equals("P114")){%><option value="P114" selected>Cleaning/Exam</option><%}else{%>
                    <option value="P114">Cleaning/Exam</option><%}%>
                    <%if(a1.getCode().equals("P119")){%><option value="P119" selected>Xrays</option><%}else{%>
                    <option value="P119">Xrays</option>><%}%>
                    <%if(a1.getCode().equals("P122")){%><option value="P122" selected>Whitening</option><%}else{%>
                    <option value="P122">Whitening</option>><%}%>
                    <%if(a1.getCode().equals("P321")){%><option value="P321" selected>Cavity</option><%}else{%>
                    <option value="P321">Cavity</option>><%}%>
                    <%if(a1.getCode().equals("P650")){%><option value="P650" selected>Top Dentures</option><%}else{%>
                    <option value="P650">Top Dentures</option>><%}%>
                    <%if(a1.getCode().equals("P660")){%><option value="P660" selected>Bottom Dentures</option><%}else{%>
                    <option value="P660">Bottom Dentures</option>><%}%>
                    <%if(a1.getCode().equals("P780")){%><option value="P780" selected>Crown</option><%}else{%>
                    <option value="P780">Crown</option>><%}%>
                    <%if(a1.getCode().equals("P790")){%><option value="P790" selected>Root Canel</option><%}else{%>
                    <option value="P790">Root Canel</option><%}%>
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
