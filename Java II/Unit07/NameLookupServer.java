/**
 * Class: CIST 2372 Java II
 * Quarter: Fall 2017
 * Instructor: Dave Busse
 * Description: Unit 07 Lab
 * Date: Due December 3rd, 2017
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
package unit07;
import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class NameLookupServer extends JFrame {
  // Text area for displaying contents
  private JTextArea jta = new JTextArea();

  public static void main(String[] args) {
   NameLookupServer server = new NameLookupServer();
  }

  public NameLookupServer() {
    // Place text area on the frame
    setLayout(new BorderLayout());
    add(new JScrollPane(jta), BorderLayout.CENTER);

    setTitle("Server");
    setSize(500, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true); // It is necessary to show the frame here!
    ArrayList<String> studentID = new ArrayList();
    ArrayList<String> studentName = new ArrayList();
    studentID.add("7000123");
    studentID.add("7000453");
    studentID.add("7000677");
    studentID.add("7000799");
    studentID.add("7000388");
    studentName.add("John Doe");
    studentName.add("Mary Smith");
    studentName.add("G. Washington");
    studentName.add("B. Franklin");
    studentName.add("B. Ford");
    
    try {
      // Create a server socket
      ServerSocket serverSocket = new ServerSocket(8000);
      jta.append("Server started at " + new Date() + '\n');
          // Listen for a connection request
      Socket socket = serverSocket.accept();
      // Create data input and output streams
      InputStreamReader inputFromClient = new InputStreamReader(socket.getInputStream());
      PrintWriter outputToClient = new PrintWriter(socket.getOutputStream());
      BufferedReader reader = new BufferedReader(inputFromClient);
      while(true){     
      String id = reader.readLine();
          if (studentID.contains(id) == true){
              int num = studentID.indexOf(id);
              outputToClient.println(studentName.get(num));
              outputToClient.flush();
          }
          else{
              outputToClient.println("Not Found");
              outputToClient.flush();
          }
      }
    }
    catch(IOException ex) {
      System.err.println(ex);
    }
  }
}
