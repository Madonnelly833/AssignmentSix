package homeworkassignmentsix;

import java.util.Scanner;

import homeworkassignmentsix.Warrior;

public class Game2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String userInputF = null;
		String userInputE = null;
		String userInputD = null;
		String userInputB = null;
		String userInputC = null;
		int attribute = 0;
		boolean userFailed = false;

		Warrior warrior1 = new Warrior();

		System.out.println("Hail Adventurer!");
		System.out.println("What is the name of your hero?");
		String userInputA = sc.nextLine();

		String name = userInputA;
		System.out.println("What is the race of your hero?");
		userInputB = sc.nextLine();

		String race = userInputB;

		System.out.println("What is the gender of your hero?");
		userInputD = sc.nextLine();

		String gender = userInputD;

		System.out.println("What is the armor of your hero?");
		userInputE = sc.nextLine();

		String armor = userInputE;

		do {
			System.out.println("What is the Strength of your hero?");
			userInputC = sc.nextLine();

			userFailed = numberIsValid(userInputC);

		} while (userFailed);

		attribute = Integer.parseInt(userInputC);

		warrior1.setStr(attribute);

		do {
			userFailed = false;

			System.out.println("What is the Dexterity of your hero?");
			userInputC = sc.nextLine();

			userFailed = numberIsValid(userInputC);

		} while (userFailed);

		attribute = Integer.parseInt(userInputC);

		warrior1.setDex(attribute);

		do {
			userFailed = false;

			System.out.println("What is the Constitution of your hero?");
			userInputC = sc.nextLine();

			userFailed = numberIsValid(userInputC);

		} while (userFailed);

		attribute = Integer.parseInt(userInputC);

		warrior1.setCon(attribute);

		do {
			userFailed = false;

			System.out.println("What is the Intelligence of your hero?");
			userInputC = sc.nextLine();

			userFailed = numberIsValid(userInputC);

		} while (userFailed);

		attribute = Integer.parseInt(userInputC);

		warrior1.setInt(attribute);

		do {
			userFailed = false;

			System.out.println("What is the Charisma of your hero?");
			userInputC = sc.nextLine();

			userFailed = numberIsValid(userInputC);

		} while (userFailed);

		attribute = Integer.parseInt(userInputC);

		warrior1.setCha(attribute);

		System.out.println("What is your war cry?");
		userInputF = sc.nextLine();

		String shout = userInputF;

		System.out.println("Welcome " + name + "!" + " You are a " + race + ", " + gender + " in " + armor
				+ " armor with the following attributes: ");
		System.out.println(warrior1.toString());
		System.out.println("Your warcry is " + "'" + shout + "!'");

	}

	// main

	public static boolean numberIsValid(String someStringToMakeANumber) {

		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;

		} catch (NumberFormatException e) {
			return true;
		}

	}

}
