package arrayAdvancedAlgorithms2;

import java.util.Scanner;

class Sorting{
	int arr[];
	int size;
	public Sorting(){
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	public void sortArray(){
		int mn=Integer.MAX_VALUE;
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			mn=Math.min(mn,arr[i]);
			mx=Math.max(mx,arr[i]);
		}
		int range=mx-mn+1;
		int count[]=new int[range];
		for(int i=0;i<size;i++) {
			count[arr[i]-mn]++;
		}
		for(int i=0;i<range;i++) {
			while(count[i]-->0)
			System.out.print(i+mn+" ");
		}
	}
}

public class PigeonHoleSorting {

	public static void main(String[] args) {
		Sorting a=new Sorting();
		a.sortArray();

	}

}


// This sorting algorithm is used in case of small range. Else space complexity will be huge.
// TC: O(N)+O(Range)
// SC: O(Range)
