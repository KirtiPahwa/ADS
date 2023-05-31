
package arrays1;
import java.util.Scanner;
class ReversePart{
	int [] array;
	int arraySize;
	Scanner sc=new Scanner(System.in);
	
	ReversePart(){
	System.out.println("Enter size of the array");
	arraySize=sc.nextInt();
	array=new int[arraySize];
	System.out.println("Enter elements of the array");
	for(int i=0;i<arraySize;i++) {
		array[i]=sc.nextInt();
	}
}
	void reversePart() {
		int k;
		System.out.println("Enter length of part you want to reverse ");
		k=sc.nextInt();
		
		int pointer1=0, pointer2=k-1;
		while(pointer1<pointer2) {
			int temp=array[pointer1];
			array[pointer1]=array[pointer2];
			array[pointer2]=temp;
			
			pointer1++;
			pointer2--;
		}
		for(int i=0;i<arraySize;i++) {
			System.out.print(array[i]+" ");
		}
	}
}

class TargetSumPair{
	int [] array;
	int arraySize, targetSum;
	Scanner sc=new Scanner(System.in);
	TargetSumPair(){
		takeInput();
	}
	void takeInput(){
		
		System.out.println("Enter size of the array");
		arraySize=sc.nextInt();
		array=new int[arraySize];
		System.out.println("Enter elements of the array");
		for(int i=0;i<arraySize;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter target sum");
		targetSum=sc.nextInt();
	}
	void findTargetSumPair() {
		int pointer1=0, pointer2=arraySize-1,sum;
		while(pointer1<pointer2) {
			sum=array[pointer1]+array[pointer2];
			if(sum==targetSum) {
				System.out.println("("+array[pointer1]+","+array[pointer2]+")");
				pointer1++;pointer2--;
			}
			else if(sum<targetSum)pointer1++;
			else pointer2--;
		}
	}
	

}
public class TwoPointersTechnique {
//used for pairs
//array must be sorted and with distinct elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TargetSumPair tsp=new TargetSumPair();
//		tsp.findTargetSumPair();
		ReversePart rp=new ReversePart();
		rp.reversePart();
	}

}