package uebung2_5_1;

import javax.management.StringValueExp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller  {
	
	

	@FXML
	TextField initialCapitalTextField;
	@FXML
	TextField interestRateTextField;
	@FXML
	TextField runningTimeTextField;
	@FXML
	Label interestLabel;
	@FXML
	Button calculateInterestButton;
	
	@FXML
	public void handle(ActionEvent event) {
		if (event.getSource().equals(calculateInterestButton)) {
			try
			{
				
			TextField textField1 = initialCapitalTextField;
			double akapital = Double.parseDouble(textField1.getText());
	
			TextField textField2 = interestRateTextField;
			double zinssatz = (Double.parseDouble(textField2.getText()))/100+1;
			
			TextField textField3 = runningTimeTextField;
			double laufzeit = Double.parseDouble(textField3.getText());
			
			double zinsen = akapital*Math.pow(zinssatz, laufzeit)-akapital;
			
			Label label5 = interestLabel;
			label5.setText(Double.toString(zinsen));
			} catch (NumberFormatException e) {
				
				interestLabel.setText("ungültige oder fehlende Angaben");
			}
			
			
			
			
		} 
	}

}
