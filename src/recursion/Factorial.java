package recursion;

public class Factorial {
	public static int helper(int n) {
		if(n==1) {
			return 1;
		}
		return n*helper(n-1);
	}

	public static void main(String[] args) {
		int ans=helper(5);
		System.out.println(ans);
	}

}
