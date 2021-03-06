package uebung2_8_1;

import java.util.Random;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.Image;

public class Model {
	
	
	/*
	 * Singleton-Bereich
	 */
	private static Model instance;

	private Model() {
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	
	/*
	 * Model-Bereich
	 */
	private Dice dice = new Dice();
	
	private StringProperty diceValueProperty = new SimpleStringProperty();

	public Image rollTheDiceAndGetImage() {
		dice.rollTheDice();
		diceValueProperty.set(String.valueOf(dice.getValue()));
		return dice.getImage();
	}
	
	public StringProperty getDiceValueProperty() {
		return diceValueProperty;
	}



}
