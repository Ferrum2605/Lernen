package uebung2_6_1;

import javax.management.StringValueExp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

public class Controller {

	@FXML
	private ImageView imageView;
	
	@FXML
	private Button button;

	@FXML 	
	public void handle(ActionEvent event) {
		
			Model model = Model.getInstance();
			Image image = model.rollTheDiceAndGetImage();
			imageView.setImage(image);
		}
	

}
