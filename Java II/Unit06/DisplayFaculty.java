/**
 * Class: CIST 2372 Java II
 * Quarter: Fall 2017
 * Instructor: Dave Busse
 * Description: Unit 06 Lab
 * Date: Due November 19th, 2017
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
package unit06;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Alert.*;
import javafx.scene.text.Text;
import java.sql.*;

public class DisplayFaculty extends Application {
    public static void main(String[] args){            
        try{
        Class.forName("com.mysql.jdbc.Driver"); 
        System.out.println("Driver loaded");
        }
        catch (ClassNotFoundException ex){}
        launch(args);
        
    }
    private String database_name = "null";
    private String search_id;
    private int n = 0;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    public static int getResultSetRowCount(ResultSet resultSet) {
    int size = 0;
    try {
        resultSet.last();
        size = resultSet.getRow();
        resultSet.beforeFirst();
    }
    catch(SQLException ex) {
        return 0;
    }
    return size;
    }
    
    @Override
    public void start (Stage primaryStage){
    
    VBox pane = new VBox();
    
    MenuBar menuBar = new MenuBar();
    Menu menuEdit = new Menu("Edit");
    Menu menuFile = new Menu("File");
    MenuItem search = new MenuItem("Search");
    MenuItem clear = new MenuItem("Clear");
    menuEdit.getItems().addAll(search, clear);
    MenuItem connect = new MenuItem("Connect");
    MenuItem close = new MenuItem("Close");
    MenuItem exit = new MenuItem("Exit");
    menuFile.getItems().addAll(connect, close, exit);
    menuBar.getMenus().addAll(menuFile, menuEdit);
    
    BorderPane borderPane1 = new BorderPane();
    TextArea textArea = new TextArea();
    Label label1 = new Label("No Connection");
    Label label2 = new Label("Number of Faculty = " + n);
    borderPane1.setTop(textArea);
    
    BorderPane borderPane2 = new BorderPane();
    borderPane2.setLeft(label1);
    borderPane2.setRight(label2);
    borderPane1.setBottom(borderPane2);
    
    connect.setOnAction(e->{
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Database name?");
        dialog.setHeaderText("Please enter the database name:");
        Optional<String> result = dialog.showAndWait();
            if(result.isPresent() && result.get().equals("javabook")){
            database_name = "javabook";    
            label1.setText("Connected to " + database_name);  
            try{
            connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook?autoReconnect=true&useSSL=false","scott","tiger");
            System.out.println("Database connected");}
            catch(SQLException ex){}
        }
        else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Database not found");
            Optional<ButtonType> result1 = alert.showAndWait(); 
            if ((result1.isPresent()) && (result1.get() == ButtonType.OK)) {                
            }
        }
    });
    close.setOnAction(e->{
        if(database_name.equals("javabook")){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setContentText("Are you sure you want to close?");
        Optional<ButtonType> result = alert.showAndWait();
        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
            database_name = "null";
            label1.setText("No Connection"); 
            try{connection.close(); System.out.println("Database connection closed");}
            catch(SQLException ex){}
        }
        }
        else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No database connected");
            Optional<ButtonType> result1 = alert.showAndWait(); 
            if ((result1.isPresent()) && (result1.get() == ButtonType.OK)) {                
            }
        }
    });
    exit.setOnAction(e->{
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setContentText("Are you sure you want to exit?");
        Optional<ButtonType> result = alert.showAndWait();
        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
         System.exit(0);
        }
    });
    search.setOnAction(e->{
        if(database_name.equals("null")){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No database to search");
            Optional<ButtonType> result = alert.showAndWait(); 
            if ((result.isPresent()) && (result.get() == ButtonType.OK)) {                
            }
        }
        else{
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Faculty ssn number");
            dialog.setHeaderText("Please enter a faculty ssn number(can use a wildcard):");
            Optional<String> result = dialog.showAndWait();
            search_id = result.get();      
            n = 0;
            textArea.setText("");
            try{
            statement = connection.createStatement();  
            resultSet = statement.executeQuery("select ssn, firstName, lastName, phone"
            + " from Faculty where ssn like '" + search_id + "'");
            if(getResultSetRowCount(resultSet) == 0){
                n = 0;
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("No matching faculty records were found");
                Optional<ButtonType> result1 = alert.showAndWait();
                if ((result1.isPresent()) && (result1.get() == ButtonType.OK)) {                
                }
            }
            else{
            while (resultSet.next()) {          
            n++;    
            textArea.appendText(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" +
            resultSet.getString(3) + "\t" +  resultSet.getString(4) + "\n");
            }
            }
            label2.setText("Number of Faculty = " + n);
            }
            catch(SQLException ex){}
           }  
    });
    clear.setOnAction(e->{
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setContentText("Are you sure you want to clear the data?");
        Optional<ButtonType> result = alert.showAndWait();
        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
            textArea.setText("");
            n = 0;
            label2.setText("Number of Faculty = " + n);
        }        
    });   
    pane.getChildren().addAll(menuBar, borderPane1);

        Scene scene = new Scene(pane, 400, 260);
	primaryStage.setTitle("Display Faculty"); 
	primaryStage.setScene(scene); 
	primaryStage.show();
    }
}