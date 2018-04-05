/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Unit 7 Program 2
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Unit07_Prog2 extends Application{
	public void start(Stage primaryStage){
		
		HBox hb = new HBox();
		hb.setAlignment(Pos.CENTER);
		Button button1 = new Button("Button 01");
		Button button2 = new Button("Button 02");
		Button button3 = new Button("Button 03");		
		hb.getChildren().add(button1);
		hb.getChildren().add(button2);
		hb.getChildren().add(button3);
		ButtonHandler1 handler1 = new ButtonHandler1();
		button1.setOnAction(handler1);
		ButtonHandler2 handler2 = new ButtonHandler2();
		button2.setOnAction(handler2);
		ButtonHandler3 handler3 = new ButtonHandler3();
		button3.setOnAction(handler3);
		button1.setPrefSize(100, 20);
		button2.setPrefSize(100, 20);
		button3.setPrefSize(100, 20);
			
		Scene scene = new Scene(hb, 310, 60); 
		primaryStage.setTitle("Three Button Demo");//set the stage title
		primaryStage.setScene(scene);//Place the scene in the stage
		primaryStage.show();//Display the stage
	}
	class ButtonHandler1 implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e){
			
			System.out.println("Button 01 pressed!");
		}
	}
	class ButtonHandler2 implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e){
			
			System.out.println("Button 02 pressed!");
		}
	}
	class ButtonHandler3 implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e){
			
			System.out.println("Button 03 pressed!");
		}
	}
}
















