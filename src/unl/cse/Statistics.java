package unl.cse;

public class Statistics {

	public static int getSum(int array[]) {
		
		//if statements don't need braces if we are only executing one line based on it's condition
		if(array == null || array.length < 1)
			return 0;

		
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
	  return sum;
	}
	
	public static double getAverage(int array[]) {
		if(array == null || array.length < 1)
			return 0;
		int sum = getSum(array);
		return sum / (double) array.length;
	}
	
	public static int getMin(int array[]) {
		if(array == null || array.length == 0)
			return 0;
		int min = array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int getMax(int array[]) {
		//error checking:
		if(array == null || array.length < 1) {
			return 0;
		}
		
		int max = array[0];
		for(int i =1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
	  return max;
	}
}
