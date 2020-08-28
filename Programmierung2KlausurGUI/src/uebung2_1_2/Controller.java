package uebung2_1_2;

import javax.management.StringValueExp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements EventHandler<ActionEvent> {

	private View view;
	private Dice dice = new Dice(1);

	public Controller(View view) {
		this.view = view;
	}

	public void handle(ActionEvent event) {
		if (event.getSource().equals(view.getButton())) {
			// Eingabefeld der View auslesen
			dice.rollTheDice();
			view.getLabel().setText(String.valueOf(dice.getValue()));
			
		} 
	}

}
