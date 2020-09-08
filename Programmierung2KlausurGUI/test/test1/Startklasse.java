package test1;

import java.io.IOException;
import java.util.Arrays;

public class Startklasse {

	public static void main(String[] args) {

		byte[] input = new byte[256];
		int noBytes = 0;
		String output;

		System.out.print("Eingabe: ");
		try {
			noBytes = System.in.read(input);
		} catch (IOException e) {
			e.printStackTrace();
		}

		output = new String(input);

		System.out.println("Eingabe: " + input);
		System.out.println("Anzahl Bytes: " + noBytes);
		System.out.println("Eingabe (als String): " + Arrays.toString(input));
		System.out.println("Ausgabe: " + output);

	}


}
