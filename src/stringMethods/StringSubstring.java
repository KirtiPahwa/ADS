package stringMethods;

public class StringSubstring {

	public static void main(String[] args) {
//		1. s.substring(int startIndex)
		String s="hello";
		System.out.println(s.substring(2)); // return llo
		 
//		2. s.substring(int startIndex,int endIndex)  : startIndex-inclusive , endIndex-exclusive
		System.out.println(s.substring(0,3));

	}

}
