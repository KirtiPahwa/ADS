package recursion;

import java.util.Scanner;

class RatInMazeHelper{
	int m;
	int n;
	int arr[][];
	RatInMazeHelper(){
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		arr=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	void helper(int i,int j,String s) {
		if(i>=m || j>=n || i<0 || j<0 || arr[i][j]>=1) {
			return ;
		}
		if(i==m-1 && j==n-1) {
			System.out.println(s);
		}
		arr[i][j]=2;
		helper(i+1,j,s+'D');
		helper(i,j+1,s+'R');
		helper(i-1,j,s+'U');
		helper(i,j-1,s+'L');
		arr[i][j]=0;
	}
}

public class RateInMaze {

	public static void main(String[] args) {
		RatInMazeHelper obj=new RatInMazeHelper();
		String s="";
		obj.helper(0, 0, s);

	}

}
