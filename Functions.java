public class Kata{
	public static void main (String[]args){
	
	}
	
	
public static boolean isEven(number){
 if(number%2==0) return true;
 else return false;
} 

public static long squareOf(number){
 return number * number;
} 

public static boolean isPrimeNumber(number){
 int factor = 0;
 for(int count = 1; count<=number; count++){
 if(number%count==0){
 factor++;
 };} 
 if (factors == 2) return true;
 else return false;
 }

public static int subtract(numberOne, numberTwo){
	int result = numberOne - numberTwo;
	if (result<0) result = -1 * result;
	return result;
} 

public static boolean isPalindrome(number){
	
 if(number.charAt(0)==number.charAt(4) && number.charAt(1) == number.charAt) return true;
 else return false;
} 

public static long factorialOf(number){
 int factorial = 1;
 for(int count = 1; count<=number; count++){
 	factorial *= count;
 };
	return factorial;
}

public static int isPrimeNumber(number){
 int factor = 0;
 for(int count = 1; count<=number; count++){
 if(number%count==0){
 factor++;
 };} 
 return factor;
 }




}
