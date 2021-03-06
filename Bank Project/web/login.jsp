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
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="LoginServlet" method="post">
        <table>
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
        </table>    
        </form>
    </body>
</html>
