package uebung2_7_1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

	@FXML
	TextField initialCapitalTextField;
	@FXML
	TextField interestRateTextField;
	@FXML
	TextField runningTimeTextField;
	@FXML
	Button goToOutputButton;

	public void goToOutput(ActionEvent actionEvent) throws IOException {
		Model model = Model.getInstance();
		try {
			model.setInitialCapital(Double.valueOf(initialCapitalTextField.getText()));
			model.setInterestRate(Double.valueOf(interestRateTextField.getText()));
			model.setRunningTime(Integer.valueOf(runningTimeTextField.getText()));
		} catch (NumberFormatException e) {
			System.out.println("ungültige oder fehlende Angaben");
			return;
		}

		Parent root = FXMLLoader.load(getClass().getResource("View2.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) goToOutputButton.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}

