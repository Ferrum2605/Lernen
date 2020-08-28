package uebung2_2_1;

import javax.management.StringValueExp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements EventHandler<ActionEvent> {

	private View view;
	//private Dice dice = new Dice(1);

	public Controller(View view) {
		this.view = view;
	}

	public void handle(ActionEvent event) {
		if (event.getSource().equals(view.getButton())) {
			try
			{
				
			TextField textField1 = view.getTextField1();
			double akapital = Double.parseDouble(textField1.getText());
	
			TextField textField2 = view.getTextField2();
			double zinssatz = (Double.parseDouble(textField2.getText()))/100+1;
			
			TextField textField3 = view.getTextField3();
			double laufzeit = Double.parseDouble(textField3.getText());
			
			double zinsen = akapital*Math.pow(zinssatz, laufzeit)-akapital;
			
			Label label5 = view.getLabel5();
			label5.setText(Double.toString(zinsen));
			} catch (NumberFormatException e) {
				
				view.getLabel5().setText("ungültige oder fehlende Angaben");
			}
			
			
			
			
		} 
	}

}
