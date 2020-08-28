package uebung2_8_1;

import java.net.URL;
import java.util.ResourceBundle;

import javax.management.StringValueExp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
	
	Model model = Model.getInstance();

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
	
	public void initialize(URL location, ResourceBundle resource)
	{
		input.textProperty().bindBidirectional(model.getText());
	}
	

}
