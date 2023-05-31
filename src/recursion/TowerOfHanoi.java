package recursion;

public class TowerOfHanoi {
	static int cnt=0;
	public static void toh(int n,char src,char dest,char helper,int k) {
		if(n==0) {return;}
		toh(n-1,src,helper,dest,k);
		if(n==k && dest=='B') {
			cnt++;
		}
		System.out.println("Move "+n+"th disc from "+src+" to "+dest);
		toh(n-1,helper,dest,src,k);
	}
	public static void main(String[] args) {
		toh(3,'A','C','B',2);
		System.out.println(cnt);
	}

}
