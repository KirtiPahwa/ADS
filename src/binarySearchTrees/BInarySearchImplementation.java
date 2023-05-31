package binarySearchTrees;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;


class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}
}
class Pair{
	Node node;
	int order;
	Pair(Node node,int order){
		this.node=node;
		this.order=order;
	}
}
class BinarySearchTree{
	Node head;
	BinarySearchTree(){
		head=null;
	}
	Node insertNode(int data,Node temp) {
		if(temp==null) {
			temp=new Node(data);
			if(head==null) {
				head=temp;
			}
			return temp;		
		}
		if(data<temp.data) {
			temp.left=insertNode(data,temp.left);
		}else {
			temp.right=insertNode(data,temp.right);
		}
		return temp;
	}
	
	Node deleteNode(int data,Node temp) {
		if(temp==null)return null;
		if(data<temp.data) {
			temp.left=deleteNode(data,temp.left);
			return temp;
		}else if(data>temp.data) {
			temp.right=deleteNode(data,temp.right);
			return temp;
		}else {
			if(temp.left==null) {
				Node toBeDelete=temp;
				temp=temp.right;
				toBeDelete=null;
				return temp;
			}else if(temp.right==null) {
				Node toBeDelete=temp;
				temp=temp.left;
				toBeDelete=null;
				return temp;
			}else{
				
//				inorder successor
				Node temp2=temp.right;
				while(temp2.left!=null) {
					temp2=temp2.left;
				}
			
//				chanaging just dtaa value of the node and we will delete the node(leaf) whose value we used to delete temp
				temp.data=temp2.data;
				temp.right=deleteNode(temp.data,temp.right);
				return temp;
			}
			
		}
	}
	
	void preorder(Node temp) {
		if(temp==null)return;
		System.out.print(temp.data+" ");
		preorder(temp.left);
		preorder(temp.right);
	}
	
	
	void topView(Node temp) {
		if(temp==null)return;
		Queue<Pair>q=new LinkedList<Pair>();
		HashMap<Integer,Integer>s=new HashMap<Integer,Integer>();
		q.add(new Pair(temp,0));
		while(!q.isEmpty()) {
			Pair top=q.poll();
			if(!s.containsKey(top.order)) {
				s.put(top.order,top.node.data);
			}
			if(top.node.left!=null) {
				q.add(new Pair(top.node.left,top.order-1));
//				s.add(new Pair(top.node.left,top.order-1));
			}
			if(top.node.right!=null){
				q.add(new Pair(top.node.right,top.order+1));
//				s.add(new Pair(top.node.right,top.order+1));
			}
		}
		for(Map.Entry<Integer,Integer>i:s.entrySet()) {
			System.out.println(i.getValue());
		}
	}
}

public class BInarySearchImplementation {

	public static void main(String[] args) {
		BinarySearchTree obj=new BinarySearchTree();
		Node temp=obj.head;
		temp=obj.insertNode(3, temp);
		obj.insertNode(1, temp);
		obj.insertNode(2, temp);
		obj.insertNode(4, temp);
		obj.insertNode(5, temp);
		
		
//		obj.preorder(temp);	
		
//		obj.deleteNode(3, temp);
//		System.out.println();
		
//		obj.preorder(temp);		
		System.out.println();

		obj.topView(temp);

	}

}
