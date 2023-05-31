package arrayAdvancedAlgorithms1;
import java.util.Scanner;
class Kadanes {
	int size;
	int arr[];
	
	public Kadanes(){
		input();
	}
	private void input() {
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
//	-5 4 8 2 1
	public void maxSumSubarray() {
		int sum=0;
		int mxSum=Integer.MIN_VALUE;
		int s=0;
		int e=0;
		int prevS=0;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
			
			if(mxSum<sum){
			    e=i;
			    prevS=s;
			    mxSum=sum;
			}
			if(sum<0) {
					s=i+1;
				sum=0;
			}
		}
				System.out.println(mxSum);
		for(int i=prevS;i<=e;i++) {
			System.out.print(arr[i]+" ");
		}
	
}
}
public class KadanesAlgorithm {

	public static void main(String[] args) {
		Kadanes a=new Kadanes();
		a.maxSumSubarray();

	}

}
