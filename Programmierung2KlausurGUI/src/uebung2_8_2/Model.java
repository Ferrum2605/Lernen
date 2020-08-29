package uebung2_8_2;

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
	
	private String diceValueProperty = "";

	public Image rollTheDiceAndGetImage() {
		
		dice.rollTheDice();
		diceValueProperty = Integer.toString(dice.getValue());
		return dice.getImage();
	}
	
	public String getDiceValueProperty() {
		System.out.println(diceValueProperty);
		return diceValueProperty;
	}



}
