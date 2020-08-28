package uebung2_1_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startklasse extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Aufgabe 2.1");
		primaryStage.setHeight(200);
		primaryStage.setWidth(200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	

}
