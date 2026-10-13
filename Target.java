import java.util.Arrays;

public class Target{
	public static void main(String[]args){
	
	int[] numbers = {2,7,11,15};
	int target = 9;
	
	int count = 0;
	int counter = 0;
	
	for(; count < numbers.length; count++){
		for(; counter < numbers.length; counter++){
			int tempTarget = numbers[count] + numbers[counter];
			if (tempTarget == target) {
				int[] result = {count,counter};
				System.out.print(Arrays.toString(result));
				break;
				
				}
	}
	
	}
	}
}
