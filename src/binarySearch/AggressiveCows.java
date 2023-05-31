package binarySearch;
import java.util.*;

public class AggressiveCows {
	public static boolean check(int mid,int child,int arr[]){
	    int cnt=1;
	    int pos=0;
	    int n=arr.length;
	    for(int i=1;i<n;i++){
	        if(arr[i]-arr[pos]>=mid){
	            cnt++;
	            pos=i;
	            if(cnt>=child){
	            return true;
	        }
	        }    
	    }
	    return false;
	}
	public static int helper(int child,int arr[]){
	    int n=arr.length;
	    int s=1;
	    int e=arr[n-1]-arr[0];
	    int ans=0;
	    while(s<=e){
	        int mid=(s+e)/2;
	        if(check(mid,child,arr)){
	            ans=mid;
	            s=mid+1;
	        }else{
	            e=mid-1;
	        }
	    }
	    return ans;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int child=sc.nextInt();
		    int ans=helper(child,arr);
		System.out.println(ans);
	}

}


