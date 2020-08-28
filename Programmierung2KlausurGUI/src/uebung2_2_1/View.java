package uebung2_2_1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class View {
	
	private Button button;
	
	private Label label1;
	private Label label2;
	private Label label3;
	private Label label4;
	private Label label5;
	
	private TextField textField1;
	private TextField textField2;
	private TextField textField3;
	
	
	private GridPane root;
	
	public View()
	{
		button = new Button("Zinsen berechnen");
		button.setOnAction(new Controller(this));
		
		label1 = new Label("Anfangskapital");
		label2 = new Label("Zinssatz");
		label3 = new Label("Laufzeit");
		label4 = new Label("Zinsen");
		label5 = new Label();
		
		textField1 = new TextField();
		textField2 = new TextField();
		textField3 = new TextField();
		
		root = new GridPane();
		root.add(label1, 0, 0);
		root.add(label2, 0, 1);
		root.add(label3, 0, 2);
		root.add(label4, 0, 3);
		root.add(label5, 1, 3);
		root.add(textField1, 1, 0);
		root.add(textField2, 1, 1);
		root.add(textField3, 1, 2);
		root.add(button, 1, 4);
		
		
		
	}
	
	public Label getLabel1() {
		return label1;
	}

	public Label getLabel2() {
		return label2;
	}

	public Label getLabel3() {
		return label3;
	}

	public Label getLabel4() {
		return label4;
	}

	public Label getLabel5() {
		return label5;
	}

	public TextField getTextField1() {
		return textField1;
	}

	public TextField getTextField2() {
		return textField2;
	}

	public TextField getTextField3() {
		return textField3;
	}

	public GridPane getRoot()
	{
		return root;
	}

	public Button getButton() {
		return button;
	}

	

	
	
	
	
	

}

