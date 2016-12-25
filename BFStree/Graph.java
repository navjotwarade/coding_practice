package BFStree;
//Java program to print BFS traversal from a given source vertex.
//BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;

//This class represents a directed graph using adjacency list
//representation
class Graph
{
 private int V;   // No. of vertices
 private LinkedList<Integer> adj[]; //Adjacency Lists

 // Constructor
 Graph(int v)
 {
     V = v;
     adj = new LinkedList[v];
     for (int i=0; i<v; ++i)
         adj[i] = new LinkedList();
 }

 // Function to add an edge into the graph
 void addEdge(int v,int w)
 {
     adj[v].add(w);
 }

 // prints BFS traversal from a given source s
 void BFS(int s)
 {
     boolean [] visited = new boolean[adj.length];
	 LinkedList<Integer> queue = new LinkedList<Integer>();
	 
     queue.add(s); 	 
	 visited[s] = true;
	 while(!queue.isEmpty()){
		s = queue.poll();
		
	//	System.out.println("s: "+ s);
		Iterator<Integer> itr =  adj[s].iterator();
		while(itr.hasNext()){
			
			int n =  itr.next();
			if(!visited[n]){
				visited[n] = true;
				queue.add(n);
				System.out.println("itr: "+n);
			}
			
		}
	 }
 }

 // Driver method to
 public static void main(String args[])
 {
     Graph g = new Graph(4);

     g.addEdge(0, 1);
     g.addEdge(0, 2);
     g.addEdge(1, 2);
     g.addEdge(2, 0);
     g.addEdge(2, 3);
     g.addEdge(3, 3);

     System.out.println("Following is Breadth First Traversal "+
                        "(starting from vertex 2)");

     g.BFS(2);
 }
}