/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Unit 7 Program 1
 * Due: July 25, 2017	
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

public class Unit07_Prog1 extends Application{
	public void start(Stage primaryStage){		
		
    StackPane pane = new StackPane();
    Button button = new Button("Say 'Hello JavaFX'"); 
	pane.getChildren().add(button); 
	ButtonHandler handler1 = new ButtonHandler();
	button.setOnAction(handler1);
    Scene scene = new Scene(pane, 300, 250);
    primaryStage.setTitle("Hello JavaFX!"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
	}
	
	class ButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e){
			System.out.println("Hello JavaFX");
		}
	}
}