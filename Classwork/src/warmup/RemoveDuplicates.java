package warmup;

public class RemoveDuplicates {

	public static void main(String[]args) {
		int [] test1 = {1,4,4,5,2,4,2,5};
		int [] test2 = {34,2,7,7,7};
		int [] test3 = {};
		
		long startTime = System.nanoTime(); // record the start time
		System.out.println(countUnique(test1)); // should print 4
		long endTime = System.nanoTime(); // record stop time
		long totalTime = endTime - startTime; // calculate total time
		System.out.println("Time Taken in nanoseconds: " + totalTime);
		
		System.out.println(countUnique(test2)); // should print 3
		System.out.println(countUnique(test3)); // should print 0
	}
	
	public static int countUnique(int [] numbers) {
		
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			//assume the number is unique at first
			boolean unique = true;
			//check all subsequent numbers
			for(int j = i+1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					unique = false;
					break;
					//if a number is found that is not unique, break out since there is no reason to keep checking
				}
			}
			// if unique remains true, 1 is added to the count
			if(unique) {
				count++;
			}
		}
		return count;
	}
}
