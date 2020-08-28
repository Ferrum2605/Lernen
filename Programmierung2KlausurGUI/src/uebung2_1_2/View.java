package uebung2_1_2;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class View {
	
	private Button button;
	
	private Label label;
	
	private VBox root;
	
	public View()
	{
		button = new Button("Würfeln! ");
		button.setOnAction(new Controller(this));
		
		label = new Label();
		
		root = new VBox();
		
		root.getChildren().addAll(label, button);
		root.setAlignment(Pos.CENTER);	
	}
	
	public VBox getRoot()
	{
		return root;
	}

	public Button getButton() {
		return button;
	}

	public Label getLabel()
	{
		return label;
	}

	
	
	
	
	

}
