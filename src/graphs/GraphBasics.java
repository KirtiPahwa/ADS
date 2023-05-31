package graphs;
import java.util.*;

class Graph{
	Scanner sc=new Scanner(System.in);
	private int vertices;
	private ArrayList<Edge>[]graph;
	int count=0;
	private class Edge{
		int source , dest;
		public Edge(int source,int dest) {
			this.source=source;
			this.dest=dest;
		}
	}
	public Graph() {
		System.out.println("Enter the number of vertices:");
		vertices=sc.nextInt();
		graph=new ArrayList[vertices];
		createGraph();
	}
	void createGraph() {
		int edges;
		for(int i=0;i<vertices;i++) {
//			System.out.println("Enter the number of the edges:");
			edges=sc.nextInt();
//			System.out.println("Enter the edges of vertex:"+i);
			graph[i]=new ArrayList<>();
			for(int j=0;j<edges;j++) {
				graph[i].add(new Edge(i,sc.nextInt()));
			}
		}
//		for(int i=0;i<vertices;i++) {
//			System.out.println("node: "+i);
//			for(int j=0;j<graph[i].size();j++) {
//				Edge e=graph[i].get(j);
//				System.out.println(e.dest);
//	
//		}
//		}
		
	}
	
	void bfs(boolean[] vis,int start) {
		Queue<Integer> q=new LinkedList<>();
		q.add(start);
		while(!q.isEmpty()) {
			int curr=q.poll();
			vis[curr]=true;
			System.out.println(curr+" ");
			for(int i=0;i<graph[curr].size();i++) {
				Edge e=graph[curr].get(i);
				if(!vis[e.dest]) {
					q.add(e.dest);
				}
			}

				
			
		}
	}
	
	void bfs() {
		boolean vis[]=new boolean[vertices];
		for(int i=0;i<vertices;i++) {
			if(vis[i]) {
				bfs(vis,i);
			}
		}
	}
	
	void dfs(boolean vis[],int start) {
		System.out.println(start);
		vis[start]=true;
		for(int i=0;i<graph[start].size();i++) {
			Edge e=graph[start].get(i);
			if(!vis[e.dest]) {
				dfs(vis,e.dest);
			}
		}
	}
	void dfs() {
		boolean vis[]=new boolean[vertices];
		for(int i=0;i<vertices;i++) {
			if(!vis[i]) {
				dfs(vis,i);
			}
		}
	}
	
	void pathDfs(ArrayList<Integer> temp,int start,int destination,ArrayList<ArrayList<Integer>>ans,boolean vis[]) {	
//		System.out.println("node is "+start);
		temp.add(start);
		if(start==destination) {
//			count++;	
			ans.add(new ArrayList<Integer>());
		for(int i=0;i<temp.size();i++) {
			System.out.println(temp.get(i));
		}
		
			ans.add(temp);
			temp.clear();
			return;
		}
		vis[start]=true;
		for(int i=0;i<graph[start].size();i++) {
			Edge e=graph[start].get(i);
//			System.out.println(e.dest);
			if(vis[e.dest]==false) {
//				temp.add(e.dest);
//				vis[e.dest]=true;
				pathDfs(temp,e.dest,destination,ans,vis);
				vis[e.dest]=false;
//				temp.removeIf(n -> (n == e.dest));
			}
		}
		temp.removeIf(n -> (n == start));

	}
	
	void printPath() {
//		for(int i=0;i<graphs[])
		System.out.println("Enter the destination you want to have:");
		int destination=sc.nextInt();
		boolean vis[]=new boolean[vertices];
		ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>temp=new ArrayList<Integer>();
//		temp.add(0);
		
		pathDfs(temp,0,destination,ans,vis);
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();i++) {
				System.out.print(ans.get(i).get(j)+" ");
			}
		}
	}
	boolean checkPath(int curr,int end,boolean[] visited) {
		visited[curr]=true;
		if(curr==end) {
			return true;
		}
		for(int i=0;i<graph[curr].size();i++) {
			if(!visited[i]) {
				if(checkPath(i,end,visited)) {
					return true;
				}
			}
		}
		return false;
	}
	void checkPath() {
		boolean visited[]=new boolean [vertices];
		if(checkPath(0,4,visited))System.out.println("Yes");	
		else System.out.println("No");
	}
	
	
	void displayNeighbour() {
		System.out.println("Whose neighbour to find?");
		int neighbourOf=sc.nextInt();
		for(int i=0;i<graph[neighbourOf].size();i++) {
			Edge e=graph[neighbourOf].get(i);
			System.out.print(e.dest+" ");
		}
		}
	
	}
public class GraphBasics {

	public static void main(String[] args) {
		Graph g=new Graph();
//		g.dfs();
//		g.bfs();.
		g.printPath();
	}

/*
 3
 1
 1
 2
 0
 2
 1
 1
 */

}
