package arrayAdvancedAlgorithms1;
import java.util.Scanner;
class PrintPrimeNumbers{
	int size;
	boolean arr[];
	public PrintPrimeNumbers(){
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		arr=new boolean[size+1];
		sc.close();
	}
	void print() {
		arr[0]=true;
		arr[1]=true;
		for(int i=2;i*i<=size;i++) {  
			if(!arr[i]) {
				for(int j=i*i;j<=size;j+=i) {
					arr[j]=true;
				}
			}
		}
		for(int i=1;i<=size;i++) {
			if(arr[i]==false) {
				System.out.println(i);
			}
		}
	}
}
public class PrimeSeive {

	public static void main(String[] args) {
		PrintPrimeNumbers a=new PrintPrimeNumbers();
		a.print();
	}

}
