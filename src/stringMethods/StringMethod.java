package stringMethods;

public class StringMethod {

	public static void main(String[] args) {
		String s="Kirti";
//		1.
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s);
		System.out.println(s.toCharArray());
		
		s="  Kirti ";
//		2.
		System.out.println(s);
		System.out.println(s.trim());
		
		s="kirti";
//		3.
		System.out.println(s.startsWith("k"));//return true
		System.out.println(s.endsWith("k"));//return false
		
//		3.
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		
		s="My name is Kirti Pahwa name";
//		4. 
		System.out.println(s.replace("name", "Name")); //replace all occurences of "name"
		
		
		


	}

}
