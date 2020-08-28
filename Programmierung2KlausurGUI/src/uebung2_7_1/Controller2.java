package uebung2_7_1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller2 implements Initializable {

	@FXML
	Label interestLabel;
	@FXML
	Button backButton;

	public void initialize(URL arg0, ResourceBundle arg1) {
		Model model = Model.getInstance();
		interestLabel.setText(String.valueOf(model.getInterest()));
	}

	public void back(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) backButton.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
