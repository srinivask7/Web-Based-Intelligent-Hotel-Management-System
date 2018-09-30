package homePage;

// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.

import java.io.File;
import java.util.*;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
 
// This class represents a directed graph using adjacency list
// representation
public class BFS_Restaurant
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
 
    // Constructor
    BFS_Restaurant(int v)
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
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];
 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            if(s==4)
         	{System.out.print("Chicken Tikka ");
         
     }
         else if(s==9)
         	System.out.print("Panner, ");
         
         else if(s==5)
         {System.out.print("Mushroom, ");
        
     }
         	
         else if(s==10)
         	System.out.print("Tandoori chicken, ");
         else if(s==6)
         	{System.out.print("EggMuffin ");
         }
         else if(s==11)
         	System.out.print("BMT, ");
         else if(s==7)
         	System.out.print("Ham, ");
         else if(s==12)
         	System.out.print("Pizzola, ");
         else if(s==8)
         	System.out.print("noodles, ");
            System.out.print(s+" ");
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
 
    // Driver method to
    public static void main(String args[])
    {
        BFS_Restaurant g = new BFS_Restaurant(13);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the source Press 1 for Indian food // Press 2 for Brititsh Food //Pres 3 for"
				+ "Chineese food ");
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
		
		
        g.BFS(scan.nextInt());
        System.out.println("Following is Food Menu Suggestion "+
                           "()");
        
    }
}