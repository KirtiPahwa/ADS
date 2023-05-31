package recursion;

public class Fibonacci {
	public static int helper(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return helper(n-1)+helper(n-2);

	}

	public static void main(String[] args) {
		int ans=helper(6);
		System.out.println(ans);

	}
//	0,1,2,3,5,8,
}
