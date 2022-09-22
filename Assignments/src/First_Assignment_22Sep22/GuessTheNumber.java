package First_Assignment_22Sep22;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = ThreadLocalRandom.current().nextInt();
		
		System.out.println("Please guess a random Number 😎");
		double UserNo = scan.nextDouble();
		if (UserNo == a) {
			System.out.println("You have guessed a correct number 👍😄");
		} else {
			System.out.println("Sorry,You have guessed a incorrect number 👎😥");
		}
		if(UserNo>a)
			System.out.println("And your number is higher than the actual number");
		else if(UserNo<a)
			System.out.println("And your number is lower than the actual number");
		System.out.println("The actual number was "+a);
	}
	
		

}
