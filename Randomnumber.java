import java.util.Scanner;
import java.util.Random;

public class Randomnumber {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter any number greater than 0");
		int num = reader.nextInt();
		if (num <= 0)
			System.out.println("Please enter a number greater than 0");
		else
		{	
			Random rand = new Random();
			int randint = rand.nextInt(num);
			System.out.println("Random Number between 0 and " + Integer.toString(num) + " is " + randint);
		}
		
		
		
	}
}
