import java.util.InputMismatchException;
import java.util.Scanner;

public class HiLo {
	
	static int NUM, GUESS, guesses = 0;
	static Scanner kbin = new Scanner(System.in);
	static boolean play = true;
	
	public static void main(String[] args) {
		
		while (play == true) {
			
			System.out.print("Player 1, input number to guess: ");
			NUM = kbin.nextInt();
			
			System.out.print("Player 2, guess a number: ");
			
			try {
				GUESS = kbin.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input");
				kbin = new Scanner(System.in);
			}
			
			guesses++;
			
			while (guesses <= 5) {
				
				if (GUESS == NUM) {
					System.out.printf("You win! You took %d guesses.\n", guesses);
					break;
				} else {
					
					if (GUESS < NUM) {
						System.out.println("Too small.");
					} else {
						System.out.println("Too high");
					}
					
					System.out.println("Guess again: ");
					
					try {
						GUESS = kbin.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid input");
						kbin = new Scanner(System.in);
					}
					
					guesses++;
				}
			}
			
			if (guesses > 5) {
				System.out.printf("Game over. Player 1 wins. Correct answer is %d.\n", NUM);
			}
			
			System.out.print("Play again? (yes/no): ");
			
			if (kbin.next().toLowerCase().equals("yes")) {
				play = true;
			} else {
				play = false;
			}
		}
	}
}
