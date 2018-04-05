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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
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
    <center><h1>Please log in.</h1></center>
        <form action="LoginServlet" method="post">
        <center><table>
            <tr>
                <td><label for="idtb">ID:</label></td>
                <td><input type="Text" name="idtb"/></td>
            </tr>
            <tr>
                <td><label for="pwtb">Password:</label></td>
                <td><input type="Password" name="pwtb"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="login" value="Login"/></td>
                <td><input type="reset" name="clear" value="Clear"/></td>
            </tr>
        </table></center> 
        </form>
    </body>
</html>
