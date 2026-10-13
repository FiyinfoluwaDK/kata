import java.util.Scanner;

public class ASCIIArt{
	public static void main (String[]args){
	
	Scanner scanner = new Scanner(System.in);
        
        System.out.println("What to see: cat, house, heart or smiley? ");
        String artStyle = scanner.nextLine();

        String[][] grid;

        switch (artStyle) {
            case "cat" -> grid = catFace(); 
            case "house" -> grid = house(); 
            case "heart" -> grid = heart();
            case "smiley" -> grid = smiley(); 
            default -> {System.out.println("Invalid digit");
                return;
        }
}
        printDisplay(grid);
    }

	




	public static void printDisplay(String[][] grid){
		for(int row = 0; row < grid.length; row++){
			for(int column = 0; column < grid[row].length; column++){
			System.out.print(grid[row][column]);
			}
		System.out.println();}
		}

	
	public static String[][] catFace(){
	
	String[][] catFace = {
		{" "," "," "," "," "," "," "},
		{" ","/","\\","_","/","\\"," "},
		{" "," "," "," "," "," "," "},
		{"("," ","O",".","O"," ",")"},
		{" "," "," "," "," "," "," "},
		{" ",">"," ","^"," ","<"," "},
		{" "," "," "," "," "," "," "}
	};
	
		return catFace;

}

	public static String[][] heart(){
	
	String[][] heart = {
		{" ","*","*"," ","*","*"," "},
		{"*"," "," ","*"," "," ","*"},
		{"*"," "," "," "," "," ","*"},
		{"*"," "," "," "," "," ","*"},
		{" ","*"," "," "," ","*"," "},
		{" "," ","*"," ","*"," "," "},
		{" "," "," ","*"," "," "," "}
	};
	
		return heart;

}

	public static String[][] house(){
	
	String[][] house = {
		{" "," ","/","\\"," "," "," "},
		{" ","/"," "," ","\\"," "," "},
		{" ","-","-","-","-"," "," "},
		{" ","|"," "," ","|"," "," "},
		{" ","|","-","-","|"," "," "},
		{" ","|","|","|","|"," "," "},
		{" ","_","_","_","_"," "," "}
	};
	
		return house;

}

	public static String[][] smiley(){
	
	String[][] smiley = {
		{" "," ","*","*","*"," "," "},
		{" ","*"," "," "," ","*"," "},
		{"*"," ","O"," ","O"," ","*"},
		{"*"," "," "," "," "," ","*"},
		{"*"," ","\\","_","/"," ","*"},
		{" ","*"," "," "," ","*"," "},
		{" "," ","*","*","*"," "," "}
	};
	
		return smiley;

}
}
	
