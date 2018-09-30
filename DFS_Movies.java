package homePage;

//Java program to print DFS traversal from a given given graph
import java.io.*;
import java.util.*;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

//This class represents a directed graph using adjacency list
//representation
public class DFS_Movies
{
 private int V;   // No. of vertices

 // Array  of lists for Adjacency List Representation
 private LinkedList<Integer> adj[];

 // Constructor
 DFS_Movies(int v)
 {
     V = v;
     adj = new LinkedList[v];
     for (int i=0; i<v; ++i)
         adj[i] = new LinkedList();
 }

 //Function to add an edge into the graph
 void addEdge(int v, int w)
 {
     adj[v].add(w);  // Add w to v's list.
 }

 // A function used by DFS
 void DFSUtil(int v,boolean visited[])
 {
     // Mark the current node as visited and print it
     visited[v] = true;
     
     if(v==4)
     	{System.out.print("tum hi ho song ");
     
		
 }
     else if(v==9)
     	System.out.print("sun raha song, ");
     
     else if(v==5)
     System.out.print("Kabhi Kabhi song, ");
    
 
     	
     else if(v==10)
     	System.out.print("Kahan ho tum song, ");
     else if(v==6)
     	System.out.print("Love me Like you do song ");
     
		
     else if(v==11)
     	System.out.print("Burn song, ");
     else if(v==7)
     	System.out.print("Shake it off song, ");
     else if(v==12)
     	System.out.print("Blank Space song, ");
     else if(v==8)
     	System.out.print("Bhart song, ");
     

     // Recur for all the vertices adjacent to this vertex
     Iterator<Integer> i = adj[v].listIterator();
     while (i.hasNext())
     {
         int n = i.next();
         if (!visited[n])
             DFSUtil(n, visited);
     }
 }

 // The function to do DFS traversal. It uses recursive DFSUtil()
 void DFS(int v)
 {
     // Mark all the vertices as not visited(set as
     // false by default in java)
     boolean visited[] = new boolean[V];

     // Call the recursive helper function to print DFS traversal
     DFSUtil(v, visited);
 }

 public static void main(String args[])
 {
     DFS_Movies g = new DFS_Movies(13);
     Scanner scan = new Scanner(System.in);
		System.out.println("Enter the source Press 1 for Bollywood Movies // Press 2 for Hollywood Movies // Press 3"
				+ "for Chineese movies");
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 6);
		g.addEdge(2, 7);
		g.addEdge(3, 8);
		g.addEdge(4, 9);
		g.addEdge(5, 10);
		g.addEdge(6, 11);
		g.addEdge(7, 12);
     g.DFS(scan.nextInt());
     System.out.println("Following are the Movie List");

     
 }
}