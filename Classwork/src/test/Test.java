package test;

public class Test {

	public static void main(String[] args) {
	
		String [] words = {"hi","what","hello","no"};
		printArr(words);
		printArr(doubled(words));
	}
	public static String doubled(String str) {
		str = str + str;
		return str;
	}
	public static String[]doubled(String [] str){
		for(int i = 0; i < str.length; i++) {
			str[i] = doubled(str[i]);
		}
		return str;
	}
	private static void printArr(Object[]arr) {
		for(Object x : arr) {
			System.out.println(x);
		}
	}
}