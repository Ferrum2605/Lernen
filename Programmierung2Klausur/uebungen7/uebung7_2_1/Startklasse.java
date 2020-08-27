package uebung7_2_1;

import java.util.Scanner;

public class Startklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Barrel barrel = new Barrel(100);
		
		while(true)
		{
		System.out.println("Bitte die Menge der hinzuzufügenden Flüssigkeiten angeben: ");
		int a = sc.nextInt();
		try {
			barrel.addFluid(a);
			barrel.displayFluidLevel();
		} catch (BarrelOverflowException e) {
			System.err.println(e.getMessage());
		}
		
		}
		

	}

}
