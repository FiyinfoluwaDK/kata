//input user name
//reverse the string and reverse the vowels

import java.util.Scanner;

public class ReverseName{
	public static void main (String[]args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	String name = scanner.nextLine();
	
	int nameSize = name.length();
	
	for(int count = nameSize-1; count>= 0; count--){
		System.out.print(name.charAt(count));
	}
	
	int vowelCount = 0;
	
	for(int counter = nameSize-1; counter>= 0; counter--){
	if(Character.toLowerCase(name.charAt(counter)) == 'a'||Character.toLowerCase(name.charAt(counter)) =='e'||Character.toLowerCase(name.charAt(counter)) =='i'||Character.toLowerCase(name.charAt(counter)) =='o'||Character.toLowerCase(name.charAt(counter)) =='u'){ 
		vowelCount++;	
	}
	}
	
	System.out.println();
	System.out.println("how many vowels: "+ vowelCount);
	
	
	for(int count = 0;count < nameSize; count++){
		for(int counter = count + 1;counter < nameSize; counter++){
			if(Character.toLowerCase(name.charAt(count)) == Character.toLowerCase(name.charAt(counter)))
				System.out.println(Character.toLowerCase(name.charAt(count)));
				
	}
			
				
				
	}
	
	
	
	}

}


