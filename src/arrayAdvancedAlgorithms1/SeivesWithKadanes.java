package arrayAdvancedAlgorithms1;
import java.util.Scanner;
class MaxSubarrayOfPrimes{
	int arr[];
	int size;
	public MaxSubarrayOfPrimes() {
		Scanner sc=new Scanner (System.in);
		size=sc.nextInt();
		arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public void longestSubarrWithPrimes() {
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			mx=Math.max(mx, arr[i]);
		}
		boolean seive[]=new boolean[mx+1];
//		false for primes.
		seive[0]=true;
		seive[1]=true;
		for(int i=2;i*i<=mx;i++) {
			if(!seive[i]) {
			for(int j=i*i;j<=mx;j+=i) {
				seive[j]=true;
			}
		}
	}
		
		mx=Integer.MIN_VALUE;
		int cnt=0;
		int s=0,e=0,prevS=0;
		for(int i=0;i<size;i++) {
			if(seive[arr[i]]==false) {
				cnt++;
				if(cnt>mx){
					prevS=s;
					mx=cnt;
					e=i;

				}
			}else {
				cnt=0;
				s=i+1;
			}
		}
		System.out.println(mx);
		for(int i=prevS;i<=e;i++) {
			System.out.print(arr[i]+" ");
		}
			}
		}
public class SeivesWithKadanes {

	public static void main(String[] args) {
		MaxSubarrayOfPrimes a=new MaxSubarrayOfPrimes();
		a.longestSubarrWithPrimes();
	}

}
