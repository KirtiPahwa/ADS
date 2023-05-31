package stringMethods;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="My name is Kirti";
		String []arr=text.split(" ");
		System.out.println(arr); //will print address
		System.out.println(Arrays.toString(arr));

	}

}
