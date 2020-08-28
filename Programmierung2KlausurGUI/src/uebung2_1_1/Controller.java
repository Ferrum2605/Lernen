package uebung2_1_1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements EventHandler<ActionEvent> {

	private View view;

	public Controller(View view) {
		this.view = view;
	}

	public void handle(ActionEvent event) {
		if (event.getSource().equals(view.getButton())) {
			// Eingabefeld der View auslesen
			TextField inputTextField = view.getTextField();
			String text = inputTextField.getText();
			// Ausgabefeld der View ändern
			Label outputLabel = view.getLabel();
			outputLabel.setText(text);
		} 
	}

}
