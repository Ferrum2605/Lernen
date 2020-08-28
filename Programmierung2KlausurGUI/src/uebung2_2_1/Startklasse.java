package uebung2_2_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Startklasse extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}
	
	public void start(Stage primaryStage)
	{
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Aufgabe 2.2");
		primaryStage.setHeight(200);
		primaryStage.setWidth(600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
