package uebung2_8_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startklasse extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Aufgabe 2.8");
		primaryStage.setHeight(200);
		primaryStage.setWidth(200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
