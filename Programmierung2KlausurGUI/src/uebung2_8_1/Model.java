package uebung2_8_1;

import java.util.Random;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class Model {
	
	
	private int value;
	
	/*
	 * Singleton-Bereich
	 */
	private static Model instance;
	
	private StringProperty text;

	private Model() {
		text = new SimpleStringProperty();
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	
	private Dice dice = new Dice(1);

	public Image rollTheDiceAndGetImage() {
		dice.rollTheDice();
		return dice.getImage();
	}


}
