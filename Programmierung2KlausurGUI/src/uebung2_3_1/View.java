package uebung2_3_1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class View {
	
	private Button button;
	
	//private Label label;
	
	private ImageView imageView;
	
	private VBox root;
	
	public View()
	{
		button = new Button("Würfeln! ");
		button.setOnAction(new Controller(this));
		
		//label = new Label();
		
		imageView = new ImageView();
		
		root = new VBox();
		
		root.getChildren().addAll(imageView, button);
		root.setAlignment(Pos.CENTER);	
	}
	
	public ImageView getImageView() {
		return imageView;
	}

	public void setImageView(ImageView imageView) {
		this.imageView = imageView;
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
