import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 2, 4, 6};

		int[] numbersTwo = {8,3,13,2,1,6};
		
		
		System.out.println(Arrays.toString(descencingSort(numbers)));
		System.out.println(Arrays.toString(descencingSort(numbersTwo)));
		
			
       		}
   
   		 
	
	
	
	public static int[] descencingSort(int[] array){
    		for (int count = 0; count < array.length - 1; count++) {
        		int maxIndex = count;   
			
				
            	for (int counter = count + 1; counter < array.length; counter++) {
                	if (array[counter] > array[maxIndex]) {
                    maxIndex = counter;   
                	}
            	}
        
        	int temp = array[count];
        	array[count] = array[maxIndex];
        	array[maxIndex] = temp;
			}
				return array;
        	}
	
	
}

