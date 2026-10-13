public class CatFace{
	public static void main (String[]args){
	
	String[][] catFace = {
		{" ","/","\\","_","/","\\"," "},
		{" "," "," "," "," "," "," "},
		{"("," ","O",".","O"," ",")"},
		{" "," "," "," "," "," "," "},
		{" ",">"," ","^"," ","<"," "}
	};
	
	for(int row = 0; row < catFace.length; row++){
		for(int column = 0; column < catFace[row].length; column++){
		System.out.print(catFace[row][column]);
		}
	System.out.println();}
	
	}
}
