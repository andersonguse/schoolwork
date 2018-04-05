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
        <title>Account Lookup</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="AccountLookupServlet" method="post">
        <table>
            <tr>
                <td><label for="AcctNo">Account Number:</label></td>
                <td><input type="Text" name="AcctNo"/></td>
            </tr>
            <tr>
                <td><label for="CustomerID">Customer ID:</label></td>
                <td><input type="Text" name="CustomerID"/></td>
            </tr>
            <tr>
                <td><label for="Type">Type:</label></td>
                <td><input type="Text" name="Type"/></td>
            </tr>
            <tr>
                <td><label for="Balance">Balance:</label></td>
                <td><input type="Text" name="Balance"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="lookup" value="Lookup"/></td>
                <td><input type="reset" name="clear" value="Clear"/></td>
            </tr>
        </table>
        </form>
    </body>
</html>
