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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loops</title>
    </head>
    <body>
        <h1><%
            int count = 0;
            while(count < 10){
                count++;
                out.println("Go Braves");
            }
            %></h1>
    </body>
</html>
