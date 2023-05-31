package stringMethods;

/*
 * 1. By using equals()
 * 2. By using == operator
 * 3. By compareTo() Method
 */
public class StringCompare {

	public static void main(String[] args) {
		String a="Kirti";
		String b="Kirti";
		String c="Sonali";
		String d="KIRTI";
		String e=new String ("Kirti"); //
		
//		1. .equals() compares the values not references
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equalsIgnoreCase(d));

//		2. == equates reference not values
		System.out.println(a==b);  // bcz a and b refers to the same instance
		System.out.println(a==e);  // bcz b refers to the instance in the string pool.
		
//		3.compareTo() method compares  values lexicographically and returns and integer. s1.compareTo(s2) --> s1==s2 : returns 0 , s1>s2: returns +diff, s1<s2: returns -diff
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(a.compareTo(d));
		System.out.println(a.compareTo(e));


		

	}

}
