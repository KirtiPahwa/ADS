package recursion;

import java.util.Scanner;

class MatrixPath{
	int m;
	int n;
	int arr[][];
	MatrixPath(){
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		arr=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=0;
			}
		}
	}
	void helper(int i,int j,String s) {
		if(i>=m || j>=n) {
			return ;
		}
		if(i==m-1 && j==n-1) {
			System.out.println(s);
		}
		helper(i+1,j,s+'D');
		helper(i,j+1,s+'R');
	}
}

public class RecursionOnMatrix {

	public static void main(String[] args) {
		MatrixPath obj=new MatrixPath();
		String s="";
		obj.helper(0,0,s);
	}

}
