import java.util.Scanner;

public class Happiness {

	public static void main(String...args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
		
		int average = (firstNumber + secondNumber) / 2;
		
		if(average >= 76.2){
			System.out.println("Proficient: " + average);
		} else if (average >= 50 && average <= 76.2)
			{System.out.println("You are getting there: " + average);
		} else 
			System.out.println("Get better: " + average);
		
	}


}
