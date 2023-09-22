package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
	
	public Graph(int v) {
		
		adj= new LinkedList[v];
		
		for(int i=0;i<v;i++)
		adj[i]= new LinkedList<Integer>();
		
		
	}
	
	
	public void addEdg(int source, int dest) {
		
		adj[source].add(dest);
		adj[dest].add(source);
		
	}
	
	public static List<Integer> adj[];	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no of Vertices and Edges");
		int v= scan.nextInt();
		int e= scan.nextInt();
		
		Graph graph = new Graph(v);
		
		System.out.println("Enter "+e+" Edges");
		for(int i=0;i<e;i++) {
			int src=scan.nextInt();
		    int dest=scan.nextInt();
		    
		    graph.addEdg(src, dest);
		    
		}
		
		System.out.println();
		
		int k=0;
		for(List<Integer> l: adj) {
			
			System.out.println(k+": "+l);
			k++;
		}
		
		System.out.println("Enter the source and destination to find the min distance");
		
		int src=scan.nextInt();
		int des= scan.nextInt();
		
		findMinDist(src, des);

	}
	
	
	public static void findMinDist(int src, int dis) {
		
		int parent[]= new int[adj.length];
		boolean[] visited = new boolean[adj.length];
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(src);
		visited[src]=true;
		parent[src]=-1;
		
		
		
		while(!que.isEmpty()) {
			
		  int current = que.poll();
		  
		  if(current==dis) break;
		  
		  for(int neighbour: adj[current]) {
			  
			  if(!visited[neighbour]) {
				  
				  que.offer(neighbour);
				  visited[neighbour]=true; 
				  parent[neighbour]=current;
				  
			  }
			  
			  
		  }
			
		}
		
			int distance=0;
			int current=dis;
			
			while(parent[current]!=-1||current==src) {
				
				System.out.println(current+" -->");
				
				if(current==src)
					break;
				current=parent[current];
				distance++;
			}
		
		
		System.out.println("the min distance is "+distance);
		
	}

}
