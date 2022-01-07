package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;
		System.out.println("randomNum = " + randomNum);
		Scanner scanner = new Scanner(System.in);

		boolean gameWon = false;
		int guessNum = 0;
		while (guessNum < 5) {
			System.out.println("Pick a number between 1 and 100");
			int inputNum = scanner.nextInt();
			if (inputNum < 1 || inputNum > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else {
				if (randomNum == inputNum) {
					gameWon = true;
					System.out.println("You win!");
					break;
				} else if (randomNum > inputNum) {
					System.out.println("Please pick a higher number");
				} else if (randomNum < inputNum) {
					System.out.println("Please pick a lower number");
				}
				guessNum++;
			}
		}
		scanner.close();
		if (!gameWon)
			System.out.println("You lose, the number to guess was : " + randomNum);
	}
}
