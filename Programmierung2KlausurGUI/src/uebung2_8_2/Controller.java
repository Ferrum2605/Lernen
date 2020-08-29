package uebung2_8_2;

import java.net.URL;
import java.util.ResourceBundle;

import javax.management.StringValueExp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller {
	
	private Model model;

	@FXML
	private ImageView imageView;
	
	@FXML
	private Button button;
	
	@FXML
	private Label valueLabel;
	
	private void initialize()
	{
		
	}

	 	
	
	@FXML
	public void rollTheDice(ActionEvent event) {
		model = Model.getInstance();
		Image image = model.rollTheDiceAndGetImage();
		valueLabel.setText(model.getDiceValueProperty());
		imageView.setImage(image);
	}
	

}
