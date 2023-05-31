package conversionFunctions;

public class StringToInt {

	public static void main(String[] args) {
		String s="200";
		String t="abc";
		System.out.println(Integer.parseInt(s));
//		System.out.println(Integer.parseInt(t)); // will throw runtime errror . Cannt convert the string into numbers.

	}

}
