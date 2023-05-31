package practice;
import java.util.*;

public class SplitArray {
	public static int[][] helper(int a[]) {
		int[][]ans=new int[2][a.length/2];
		HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(mp.containsKey(a[i])) {
				mp.put(a[i],mp.get(a[i])+1);
			}else
			mp.put(a[i], 1);
		}
		int l=0;
		int r=0;
		int m=a.length/2;
		for(Map.Entry<Integer,Integer>x:mp.entrySet()) {
			if(x.getValue()>2) {
				return ans;
			}
			if(x.getValue()==2){
				ans[0][l++]=x.getKey();
				ans[1][r++]=x.getKey();
			}	
		}
		for(Map.Entry<Integer,Integer>x:mp.entrySet()) {
						if(x.getValue()==1) {
				if(l<m) {
					ans[0][l++]=x.getKey();
					
				}
				else if(r<m) {
					ans[1][r++]=x.getKey();
					
				}
			}
						
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int [][]b=helper(a);
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
