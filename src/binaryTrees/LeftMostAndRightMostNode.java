package binaryTrees;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
class BinaryTreeImplementation{
	Node head;
	BinaryTreeImplementation(){
		head=null;
	}
	void insert(int data,Node temp) {
			}
	
	void leftAndRight(Node temp) {
		if(temp==null) {
			return;
		}
		Queue<Node> q=new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty()) {
			int s=q.size();
			for(int i=0;i<s;i++) {
				Node node=q.poll();
				if(i==0) {
					System.out.print(node.data+" ");
				}
				else if(i==s-1) {
					System.out.print(node.data+" ");
				}
				if(node.left!=null) {
					q.add(node.left);
				}
				if(node.right!=null) {
					q.add(node.right);
				}
			}
		}
	}
	
}
public class LeftMostAndRightMostNode {

	public static void main(String[] args) {
		
		BinaryTreeImplementation obj=new BinaryTreeImplementation();
		obj.head=new Node(1);
		obj.head.left=new Node(2);
		obj.head.right=new Node(3);
		obj.head.left.left=new Node(4);
		obj.head.left.right=new Node(5);
		obj.head.right.left=new Node(6);
		obj.head.right.left=new Node(7);
		obj.leftAndRight(obj.head);
	   

	}

}
