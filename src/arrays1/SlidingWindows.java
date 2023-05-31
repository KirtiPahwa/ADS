
package arrays1;
import java.util.Scanner;


/*
 * -----------------rules------------------
 * scanner in another class as we need to close it also
 * import only those library which is required
 * function should shart with small
 * class name capital
 * names should be self-explanatory
 * don't do all the work inside int main
 */
class MinSumSubarray{
	Scanner sc=new Scanner(System.in);
	int arraySize, subArraySize;
	int [] array;
	
	MinSumSubarray(){
		System.out.println("Enter size of the array");
		arraySize=sc.nextInt();
		
		array=new int[arraySize];
		System.out.println("Enter elements of the array");
		for(int i=0;i<arraySize;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter subarray size");
		subArraySize=sc.nextInt();
	}
	
	void requiredMinSumSubarray() {
		int slidingWindowSum=0;
		int minSlidingWindowSum=Integer.MAX_VALUE;
		int lastIndex=0;
		for(int i=0;i<arraySize;i++) {
			slidingWindowSum+=array[i];
			if(i+1>=subArraySize) {
				if(minSlidingWindowSum>slidingWindowSum) {
					minSlidingWindowSum=slidingWindowSum;
					lastIndex=i;
				}
					
				slidingWindowSum-=array[i-subArraySize+1];
				
			}
			
		}
		System.out.println("Minimum sum of required subarray : "+minSlidingWindowSum);
		System.out.println("The elements are : ");
		for(int i=lastIndex-subArraySize+1;i<=lastIndex;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	
}
class TargetSumSubarray{
		int [] array;
		int arraySize, targetSum;
		TargetSumSubarray(){
		Scanner sc=new Scanner(System.in);
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
		
		void requiredTargetSumSubarray() {
			int slidingWindowSum=0;
			int lastIndex=0;
			for(int i=0;i<arraySize;i++) {
				while(slidingWindowSum < targetSum && lastIndex<arraySize) {
					slidingWindowSum+=array[lastIndex];
					lastIndex++;
				}
				if(slidingWindowSum==targetSum) {
					for(int j=i;j<lastIndex;j++) {
						System.out.print(array[j]+" ");
					}
					System.out.println();
				}
				//to slide window forward
				slidingWindowSum-=array[i];
			}
		}
}

//smallest subarray whose sum>=targetSum
class MaxSumSubarray{
	int [] array;
	int arraySize, targetSum;
	MaxSumSubarray(){
	Scanner sc=new Scanner(System.in);
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
	
	void requiredSubarray() {
		int slidingWindowSum=0;
		int lastIndex=0;
		int sum=Integer.MAX_VALUE;
		for(int i=0;i<arraySize;i++) {
			while(slidingWindowSum < targetSum && lastIndex<arraySize) {
				slidingWindowSum+=array[lastIndex];
				lastIndex++;
			}
			if(slidingWindowSum>=targetSum) {
				if(sum>slidingWindowSum) {
					for(int j=i;j<lastIndex;j++) {
						System.out.print(array[j]+" ");
					}
					System.out.println();
					break;
				}
				
			}
			//to slide window forward
			slidingWindowSum-=array[i];
		}
	}
	
}
public class SlidingWindows {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        MinSumSubarray MSS=new MinSumSubarray();
//        MSS.requiredMinSumSubarray();
        
        
//		TargetSumSubarray ts= new TargetSumSubarray();
//		ts.requiredTargetSumSubarray();
//		
		MaxSumSubarray ms=new MaxSumSubarray();
		ms.requiredSubarray();

	}

}