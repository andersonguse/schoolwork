/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Unit 08 Program 1
 * Due: August 1st, 2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.scene.control.PasswordField;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class Unit08_Prog1 extends Application{
  
	BorderPane getPane() {
		BorderPane pane = new BorderPane();
		HBox buttonPane = new HBox(20);
		Button btLeft = new Button("<="); 
		Button btRight = new Button("=>"); 
		buttonPane.getChildren().addAll(btLeft, btRight);
		buttonPane.setAlignment(Pos.CENTER);
		pane.setBottom(buttonPane);
			
		Text text = new Text(50, 50, "Programming is fun");
		Pane textPane = new Pane(text);
		pane.setCenter(textPane);
		textPane.setStyle("-fx-border-color: black");
	
		HBox radioPane = new HBox(20);
		radioPane.setPadding(new Insets(5, 5, 5, 5)); 
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbWhite = new RadioButton("White");
		RadioButton rbOrange = new RadioButton("Orange");
		RadioButton rbGreen = new RadioButton("Green"); 
		rbWhite.setSelected(true);
		radioPane.setAlignment(Pos.CENTER);
		pane.setTop(radioPane);
		radioPane.getChildren().addAll(rbRed, rbYellow, rbWhite, rbOrange, rbGreen);
		
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbWhite.setToggleGroup(group);
		rbOrange.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		
		rbRed.setOnAction(e -> {
			if (rbRed.isSelected()) {
				textPane.setStyle("-fx-background-color:red");
			}
		});
		rbYellow.setOnAction(e -> {
			if (rbYellow.isSelected()) {
				textPane.setStyle("-fx-background-color:yellow");
			}
		});
		rbWhite.setOnAction(e -> {
			if (rbWhite.isSelected()) {
				textPane.setStyle("-fx-background-color:white");
				textPane.setStyle("-fx-border-color: black");
			}
		});
		rbOrange.setOnAction(e -> {
			if (rbOrange.isSelected()) {
				textPane.setStyle("-fx-background-color:orange");
			}
		});
		rbGreen.setOnAction(e -> {
			if (rbGreen.isSelected()) {
				textPane.setStyle("-fx-background-color:green");
			}
		});
		btLeft.setOnAction(e -> text.setX(text.getX() - 10));
		btRight.setOnAction(e -> text.setX(text.getX() + 10));
    
		return pane;
	}	
	@Override
	public void start(Stage primaryStage){
	
		Scene scene = new Scene(getPane(), 450, 200);
		primaryStage.setTitle("Unit08_Prog1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}