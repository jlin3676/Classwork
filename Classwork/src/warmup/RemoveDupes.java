package warmup;
import java.util.ArrayList;
import java.util.Random;
public class RemoveDupes {

	public static void main(String[]args) {
		ArrayList<Integer> userInput = new ArrayList<Integer>();
		for(int i = 0; i < 30; i++) {
			userInput.add(generateNum());
		}
		removeDupes(userInput);
		for(int i = 0; i < userInput.size(); i++) {
			System.out.println(userInput.get(i));
		}
		
	}
	public static ArrayList<Integer> removeDupes(ArrayList<Integer> nums){
		for(int i = 0; i < nums.size() - 1; i++) {
			for(int j = i + 1; j < nums.size(); j++) {
				if(nums.get(i) == nums.get(j) ) {
					nums.remove(j);
					
				}
			}
		}
		return nums;
	}
	
	public static int generateNum() {
		Random rand = new Random();
		int  n = rand.nextInt(10) + 1;
		return n;
	}
	
}
