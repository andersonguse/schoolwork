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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NameLookupClient extends JFrame {
  // Text field for receiving radius
  private JTextField jtf = new JTextField();

  // Text area to display contents
  private JTextArea jta = new JTextArea();

  // IO streams
  private InputStreamReader fromServer;
  private PrintWriter toServer;
  private BufferedReader reader;

  public static void main(String[] args) {
    NameLookupClient client = new NameLookupClient();
  }

  public NameLookupClient() {
    // Panel p to hold the label and text field
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add(new JLabel("Enter ID"), BorderLayout.WEST);
    p.add(jtf, BorderLayout.CENTER);
    jtf.setHorizontalAlignment(JTextField.RIGHT);

    setLayout(new BorderLayout());
    add(p, BorderLayout.NORTH);
    add(new JScrollPane(jta), BorderLayout.CENTER);

    
    setTitle("Client");
    setSize(500, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true); // It is necessary to show the frame here!
    jtf.addActionListener(new ButtonListener());// Register listener
    
    try {
      // Create a socket to connect to the server
      Socket socket = new Socket("localhost", 8000);
      // Create an input stream to receive data from the server
      fromServer = new InputStreamReader(socket.getInputStream());
      reader = new BufferedReader(fromServer);
      // Create an output stream to send data to the server
      toServer = new PrintWriter(socket.getOutputStream());    
    }
    catch (IOException ex) {
      jta.append(ex.toString() + '\n');
    }
  }
  private class ButtonListener implements ActionListener { 
    @Override
    public void actionPerformed(ActionEvent e) {
      try {     
        while(true){
        // Get the student ID from the text field
        String id = jtf.getText().trim();

        // Send the student ID to the server
        toServer.println(id);
        toServer.flush();

        // Get name from the server
        String name = reader.readLine();

        // Display to the text area
        jta.append(name);
        }
      }
      catch (IOException ex) {
        System.err.println(ex);
      }     
    }
  }
}