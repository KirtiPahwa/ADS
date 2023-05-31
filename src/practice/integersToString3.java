package practice;
import java.util.*;

public class integersToString3 {
	public static boolean helper(String a,String b,String c) {
		for(int i=0;i<a.length();i++) {
			String temp=a.substring(0,i)+a.substring(i+1);
			if((temp.charAt(0)!='0') && Integer.parseInt(temp)+Integer.parseInt(b)==Integer.parseInt(c)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a,b,c;
		
		a=sc.next();
		b=sc.next();
		c=sc.next();
boolean ans=helper(a,b,c);	
System.out.println(ans);

	}

}
