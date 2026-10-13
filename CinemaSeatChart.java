import java.util.Scanner;

public class CinemaSeatChart{
	public static void main(String[]args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Seat number is from left to right");
	
	System.out.println();
	
	int[][] cinemaSeats = {	
							{"0","0","0","0","0"},
							{"0","0","0","0","0"},
							{"0","0","0","0","0"},
							{"0","0","0","0","0"}
													};
	
	for(int row = 0; row < cinemaSeats.length; row++){
		for(int column = 0; column < cinemaSeats[row].length; column++){
		System.out.print(cinemaSeats[row][column]);
		}
	System.out.println();}
	

	booking = true;
	
	while(booking){
			
	System.out.println("Which row do you want to sit?");
	int row = scanner.nexttInt();
	
	System.out.println("Which seat number do you want to sit?");
	int seat = scanner.nexttInt();
	
	for(int count = 0; count < cinemaSeats.length; count++){
		for(int column = 0; column < cinemaSeats[row].length; column++){
		System.out.print(cinemaSeats[row][column]);
		}
	System.out.println();}
	
	
	for(int row = 0; row < cinemaSeats.length; row++){
		for(int column = 0; column < cinemaSeats[row].length; column++){
		System.out.print(cinemaSeats[row][column]);
		}
	System.out.println();}
	
	
	}
	
	
	}
}
