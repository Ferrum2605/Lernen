package uebung2_4_1;

import javax.management.StringValueExp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements EventHandler<ActionEvent> {

	//private View view;
	private Dice dice = new Dice(1);
	
	private Image image;
	
	@FXML
	private ImageView imageView;
	
	@FXML
	private Button rollTheDiceButton;

	@FXML 	public void handle(ActionEvent event) {
		
			dice.rollTheDice();
			int wert = dice.getValue();
			image = null;
			
			switch(wert)
			{
			case 1: 
				image = new Image(getClass().getResource("/Bilder/one.PNG").toExternalForm());
				break;
			case 2:
				image = new Image(getClass().getResource("/Bilder/two.PNG").toExternalForm());
				break;
			case 3: 
				image = new Image(getClass().getResource("/Bilder/three.PNG").toExternalForm());
				break;
			case 4:
				image = new Image(getClass().getResource("/Bilder/four.PNG").toExternalForm());
				break;
			case 5: 
				image = new Image(getClass().getResource("/Bilder/five.PNG").toExternalForm());
				break;
			case 6:
				image = new Image(getClass().getResource("/Bilder/six.PNG").toExternalForm());
				break;
			}
			
			imageView.setImage(image);
			
		}
	

}
