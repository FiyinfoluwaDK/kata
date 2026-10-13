import java.util.Arrays;

public class ArrayIndexSwap {
    public static void main(String[] args) {
        int[] numbers = {3,5,2,7,8,4};

		int[] numbersTwo = {1,2,3,4,5};
		
		
		System.out.println(Arrays.toString(positionSwap(numbers)));
		System.out.println(Arrays.toString(positionSwap(numbersTwo)));
		
			
       		}
   
   		 
	
	
	
	public static int[] positionSwap(int[] array){
    		for (int count = 0; count < array.length; count++) {
        		if(count!=0){   
					if(count%2!=0){        	
					int temp = array[count-1];
					array[count-1] = array[count];
					array[count] = temp;
					}
					}
					}
        			
				return array;
        	}
	
	
}

