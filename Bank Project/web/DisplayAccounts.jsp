<%@page import="Business.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
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
        <title>Display Accounts</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            table, th, td{border: 1px solid black;}    
        </style>
    </head>
    <body>
        <%
                Customer c1;
                session = request.getSession();
                c1 = (Customer)session.getAttribute("c1");    
                c1.getAccounts();
            %>    
        <table>
            <tr>
                <th>Account Number</th>
                <th>Customer ID</th>
                <th>Type of Account</th>
                <th>Balance</th>
            </tr>
            <%
                for(int i = 0; i < c1.customerList.size(); i++){
                  Account a1 = c1.customerList.getAccount(i);  
            %>
            <tr>
                <td><%=a1.getAcctNo()%></td>
                <td><%=a1.getCid()%></td>
                <td><%=a1.getType()%></td>
                <td><%=a1.getBalance()%></td>          
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
