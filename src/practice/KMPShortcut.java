package practice;
import java.util.regex.*;

public class KMPShortcut {
	public static void main(String []args) {
		String str1="FFGFGG";
		String str2="GFG";
		Pattern patt=Pattern.compile(str2);
		Matcher ans=patt.matcher(str1);
		System.out.println(ans.find(0)); //start index is 0 //will start mathcing the pattern from the string from the start index
		System.out.println(str1.indexOf("GFG"));
	}

}
