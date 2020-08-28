package uebung2_3_1;

import javax.management.StringValueExp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

public class Controller implements EventHandler<ActionEvent> {

	private View view;
	private Dice dice = new Dice(1);
	
	private Image image;

	public Controller(View view) {
		this.view = view;
	}

	public void handle(ActionEvent event) {
		if (event.getSource().equals(view.getButton())) {
			// Eingabefeld der View auslesen
			dice.rollTheDice();
			int wert = dice.getValue();
			
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
			
			view.getImageView().setImage(image);
			
		} 
	}

}
