import java.util.Scanner;
public class NumberSegment{
	public static void main (String[]args){ 
	
	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a digit (0-9): ");
        String binaryCode = scanner.nextLine();

        String[][] grid = new String[5][4];

        switch () {
            case 0-> grid = displayZero(); 
            case 1-> grid = displayOne(); 
            case 2-> grid = displayTwo(); 
            case 3-> grid = displayThree(); 
            case 4-> grid = displayFour(); 
            case 5-> grid = displayFive(); 
            case 6-> grid = displaySix(); 
            case 7-> grid = displaySeven(); 
            case 8-> grid = displayEight();  
            case 9-> grid = displayNine(); 
            default-> System.out.println("Invalid digit");
                
        }

        printDisplay(grid);
    }
	
	public static void printDisplay(String[][] grid){
	for(int row = 0; row < 5; row++){
		for(int column = 0; column < 4; column++){
		System.out.print(grid[row][column]);
		}
	System.out.println();}
	
	
	}
	public static String[][] displayOne(){
		String[][] displayOne = {
		{" "," "," ","#"},
		{" "," "," ","#"},
		{" "," "," ","#"},
		{" "," "," ","#"},
		{" "," "," ","#"}
		};
		return displayOne;
	}
	
	public static String[][] displayTwo(){
		String[][] displayTwo = {
		{"#","#","#","#"},
		{" "," "," ","#"},
		{"#","#","#","#"},
		{"#"," "," "," "},
		{"#","#","#","#"}
		};
		return displayTwo;
	}

	public static String[][] displayThree(){
		String[][] displayThree = {
		{"#","#","#","#"},
		{" "," "," ","#"},
		{" ","#","#","#"},
		{" "," "," ","#"},
		{"#","#","#","#"}
		};
		return displayThree;
	}
	
	public static String[][] displayFour(){
		String[][] displayFour = {
		{"#"," "," ","#"},
		{"#"," "," ","#"},
		{"#","#","#","#"},
		{" "," "," ","#"},
		{" "," "," ","#"}
		};
		return displayFour;
	}
	
	public static String[][] displayFive(){
		String[][] displayFive = {
		{"#","#","#","#"},
		{"#"," "," "," "},
		{"#","#","#","#"},
		{" "," "," ","#"},
		{"#","#","#","#"}
		};
		return displayFive;
	}
	
	public static String[][] displaySix(){
		String[][] displaySix = {
		{"#","#","#","#"},
		{"#"," "," "," "},
		{"#","#","#","#"},
		{"#"," "," ","#"},
		{"#","#","#","#"}
		};
		return displaySix;
	}
	
	public static String[][] displaySeven(){
		String[][] displaySeven = {
		{"#","#","#","#"},
		{" "," "," ","#"},
		{" "," "," ","#"},
		{" "," "," ","#"},
		{" "," "," ","#"}
		};
		return displaySeven;
	}
	
	public static String[][] displayEight(){
		String[][] displayEight = {
		{"#","#","#","#"},
		{"#"," "," ","#"},
		{"#","#","#","#"},
		{"#"," "," ","#"},
		{"#","#","#","#"}
		};
		return displayEight;
	}
	
	public static String[][] displayNine(){
		String[][] displayNine = {
		{"#","#","#","#"},
		{"#"," "," ","#"},
		{"#","#","#","#"},
		{" "," "," ","#"},
		{"#","#","#","#"}
		};
		return displayNine;
	}
	
	public static String[][] displayZero(){
		String[][] displayZero = {
		{"#","#","#","#"},
		{"#"," "," ","#"},
		{"#"," "," ","#"},
		{"#"," "," ","#"},
		{"#","#","#","#"}
		};
		return displayZero;
	}
	
}



