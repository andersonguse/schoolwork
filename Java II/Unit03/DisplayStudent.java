/**
 * Class: CIST 2372 Java II
 * Quarter: Fall 2017
 * Instructor: Dave Busse
 * Description: Unit 03 Lab
 * Date: Due September 17th, 2017
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
package unit03;
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

public class DisplayStudent extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    private String database_name = "null";
    private String search_id;
    private int n = 0;
    
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
    Label label2 = new Label("Number of Students = 0");
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
        if (result.isPresent()){
            database_name = result.get();
            label1.setText("Connected to " + database_name);
        }
    });
    close.setOnAction(e->{
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setContentText("Are you sure you want to close?");
        Optional<ButtonType> result = alert.showAndWait();
        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
            database_name = "null";
            label1.setText("No Connection");
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
        if("null".equals(database_name)){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("No database to search");
            Optional<ButtonType> result = alert.showAndWait(); 
            if ((result.isPresent()) && (result.get() == ButtonType.OK)) {                
            }
        }
        else{
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Student ID?");
            dialog.setHeaderText("Please enter a student ID number:");
            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()){
            search_id = result.get();
            textArea.appendText(search_id + "\012");
            n++;
            label2.setText("Number of students = " + n);
            } 
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
            label2.setText("Number of students = " + n);
        }        
    });   
    pane.getChildren().addAll(menuBar, borderPane1);

        Scene scene = new Scene(pane, 400, 260);
	primaryStage.setTitle("Display Student"); 
	primaryStage.setScene(scene); 
	primaryStage.show();
    }
}