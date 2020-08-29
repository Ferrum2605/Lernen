package uebung2_9_1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Startklasse extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}
	
	public void start(Stage primaryStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Aufgabe 2.7");
		primaryStage.setHeight(200);
		primaryStage.setWidth(600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
