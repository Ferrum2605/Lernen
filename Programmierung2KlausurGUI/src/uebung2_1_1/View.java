package uebung2_1_1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;

public class View {
	
	private TextField textField;
	private Button button;
	private Label label;
	
	private VBox root;
	
	
	public View()
	{
		textField = new TextField();
		textField.setPromptText("Eingabe:");
		
		button = new Button("Drucktaste");
		
		label = new Label("Ausgabefeld");
		
		root = new VBox();
		
		/*
		root.getChildren().add(textField);
		root.getChildren().add(button);
		root.getChildren().add(label);
		*/
		root.getChildren().addAll(textField, button, label);
	}
	
	public VBox getRoot()
	{
		return root;
	}
	
	public TextField getTextField() {
		return textField;
	}

	public Button getButton() {
		return button;
	}

	public Label getLabel() {
		return label;
	}

}
