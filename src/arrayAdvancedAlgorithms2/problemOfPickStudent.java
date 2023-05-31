package arrayAdvancedAlgorithms2;

import java.util.*;
class StudentInfo{
	int rollNo;
	String name;
	StudentInfo(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
}

class StudentSorting{
	StudentInfo arr[];
	int size;
	public StudentSorting(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the student arrays");
		size=sc.nextInt();
		arr=new StudentInfo[size];
		for(int i=0;i<size;i++) {
		}
		for(int i=0;i<size;i++) {
			System.out.println("Enter the rollNumber and name of the student:");
			int rollNo=sc.nextInt();
			String name=sc.nextLine();
			arr[i]=new StudentInfo(rollNo,name);

		}
		sc.close();
	}
	public void SortStudents(){
		int mn=Integer.MAX_VALUE;
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			mn=Math.min(mn,arr[i].rollNo);
			mx=Math.max(mx,arr[i].rollNo);
		}
		int range=mx-mn+1;
		ArrayList<ArrayList<StudentInfo>>count=new ArrayList<ArrayList<StudentInfo>>(range);
		
		for(int i=0;i<size;i++) {
			count.add(new ArrayList<StudentInfo>());
		}
		for(int i=0;i<size;i++) {
			count.get(arr[i].rollNo-mn).add(arr[i]);
		}
		
		for(int i=0;i<range;i++) {
			for(StudentInfo s:count.get(i)) {
				System.out.print(s.name+" ");
			}
			
		}
	}
	}


public class problemOfPickStudent {

	public static void main(String[] args) {
		StudentSorting a=new StudentSorting();
		a.SortStudents();
	}

}
