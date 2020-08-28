package uebung2_1_2;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;

public class Startklasse extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}
	
	public void start(Stage primaryStage)
	{
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Aufgabe 2.1");
		primaryStage.setHeight(200);
		primaryStage.setWidth(200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
