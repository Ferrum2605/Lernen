package uebung6_4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {

	// Attribute
	private DiceCup diceCup;
	private ArrayList<Dice> dices;
	private ArrayList<Player> players;
	private Scanner scanner;
	private int noActivePlayers;

	// Methoden
	public DiceGame(ArrayList<Player> players) {
		diceCup = new DiceCup();
		dices = new ArrayList<>();
		this.players = players;
		scanner = new Scanner(System.in);
		noActivePlayers = players.size();
	}

	public void start() {
		Player bestPlayer = players.get(0);
		while (noActivePlayers > 1) 
		{
			for (Player player : players)
			{
				if (player.isActiv() && noActivePlayers > 1) 
				{
					move(player);
				}
			}
		}
		for (Player player : players) {
			if (player.getScore() > bestPlayer.getScore()) {
				bestPlayer = player;
			}
		}
		System.out
				.println("Der Sieger heißt " + bestPlayer.getName() + " und hat " + bestPlayer.getScore() + " Punkte!");
	}

	private void move(Player player) {
		int input;
		System.out.println(player.getName() + " hat aktuell " + player.getScore() + " Punkte!");
		if(player.isSpecialAvailable())
		{
			System.out.println(player.getName() + " möchtest du einmalig Spezialwürfel verwenden? (1=ja,2=nein)");
			int a = scanner.nextInt();
			switch(a)
			{
			case 1: 
				System.out.println(player.getName() + " welchen Spezialwürfel möchtest du würfeln? (1=hoch, 2=niedrig)");
				int b = scanner.nextInt();
				switch(b)
				{
				case 1:
					dices.add(new LowValueDice(1));
					dices.add(new LowValueDice(2));
					dices.add(new LowValueDice(3));
					player.setSpecialAvailable(false);
					break;
				case 2:
					dices.add(new HighValueDice(1));
					dices.add(new HighValueDice(2));
					dices.add(new HighValueDice(3));
					player.setSpecialAvailable(false);
					break;
				}
				break;
			case 2:
				dices.add(new Dice(1));
				dices.add(new Dice(2));
				dices.add(new Dice(3));
				break;
			}
		}
		else
		{
			dices.add(new Dice(1));
			dices.add(new Dice(2));
			dices.add(new Dice(3));
		}
		
		System.out.print(player.getName() + ", möchtest Du würfeln (1=ja, 2=nein)?: ");
		input = scanner.nextInt();
		if (input == 1) {
			diceCup.rollTheDices(dices);
			int score = 0;
			for (Dice dice : dices) {
				score += dice.getValue();
			}
			System.out.println(player.getName() + " hat " + score + " Punkte!");
			player.setScore(player.getScore() + score);
			System.out.println(player.getName() + " hat insgesamt " + player.getScore() + " Punkte!");
			if (player.getScore() > 50) {
				System.out.println(player.getName() + " hat verloren!");
				player.setScore(0);
				player.setActive(false);
				noActivePlayers--;
			}
		} else {
			player.setActive(false);
			noActivePlayers--;
		}
		System.out.println();
		dices.clear();
	}

}

