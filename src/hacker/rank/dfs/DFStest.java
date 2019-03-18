package hacker.rank.dfs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class DFStest {

	private static final int DFS_WHITE = -1; // normal DFS
	private static final int DFS_BLACK = 1;
	private static final int DFS_GRAY = 2;
	private static Vector<Vector<IntegerPair>> AdjList = new Vector<Vector<IntegerPair>>();
	private static Vector<Integer> dfs_num, dfs_low, dfs_parent;
	private static Vector<Boolean> articulation_vertex, visited;
	private static Stack<Integer> S; // additional information for SCC
	private static Vector<Integer> topologicalSort; // additional information
													// for toposort
	private static int numComp, dfsNumberCounter, dfsRoot, rootChildren;

	private static void initDFS(int V) { // used in normal DFS
		dfs_num = new Vector<Integer>();
		dfs_num.addAll(Collections.nCopies(V, DFS_WHITE));
		numComp = 0;
	}

	private static void printThis(String message) {
		System.out.printf("==================================\n");
		System.out.printf("%s\n", message);
		System.out.printf("==================================\n");
	}

	private static void dfs(int u) { // DFS for normal usage
		System.out.printf(" %d", u); // this vertex is visited
		dfs_num.set(u, DFS_BLACK); // mark as visited
		Iterator it = AdjList.get(u).iterator();
		while (it.hasNext()) { // try all neighbors v of vertex u
			IntegerPair v = (IntegerPair) it.next();
			if (dfs_num.get(v.first()) == DFS_WHITE) // avoid cycle
				dfs(v.first()); // v is a (neighbor, weight) pair
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		int i, j, V, total_neighbors, id, weight;

		/*
		 * // Use the following input: // Graph in Figure 4.1 9 1 1 0 3 0 0 2 0
		 * 3 0 2 1 0 3 0 3 1 0 2 0 4 0 1 3 0 0 2 7 0 8 0 1 6 0 1 6 0
		 * 
		 * // Example of directed acyclic graph in Figure 4.4 (for toposort) 8 2
		 * 1 0 2 0 2 2 0 3 0 2 3 0 5 0 1 4 0 0 0 0 1 6 0
		 * 
		 * // Example of directed graph with back edges 3 1 1 0 1 2 0 1 0 0
		 * 
		 * // Left graph in Figure 4.6/4.7/4.8 6 1 1 0 3 0 0 2 0 4 0 1 1 0 1 4 0
		 * 3 1 0 3 0 5 0 1 4 0
		 * 
		 * // Right graph in Figure 4.6/4.7/4.8 6 1 1 0 5 0 0 2 0 3 0 4 0 5 0 1
		 * 1 0 1 1 0 2 1 0 5 0 2 1 0 4 0
		 * 
		 * // Directed graph in Figure 4.9 8 1 1 0 1 3 0 1 1 0 2 2 0 4 0 1 5 0 1
		 * 7 0 1 4 0 1 6 0
		 */

		File f = new File("src/hacker/rank/dfs/in_01.txt");
		Scanner sc = new Scanner(f);

		V = sc.nextInt();
		AdjList.clear();
		for (i = 0; i < V; i++) {
			Vector<IntegerPair> Neighbor = new Vector<IntegerPair>();
			// create
			// vector
			// of
			// pair<int,
			// int>
			AdjList.add(Neighbor); // store blank vector first
		}

		for (i = 0; i < V; i++) {
			total_neighbors = sc.nextInt();
			for (j = 0; j < total_neighbors; j++) {
				id = sc.nextInt();
				weight = sc.nextInt();
				AdjList.get(i).add(new IntegerPair(id, weight));
			}
		}

		initDFS(V); // call this first before running DFS
//		printThis("Standard DFS Demo (the input graph must be UNDIRECTED)");
		for (i = 0; i < V; i++) // for each vertex i in [0..V-1]
			if (dfs_num.get(i) == DFS_WHITE) { // if not visited yet
				System.out.printf("Component %d, visit:", ++numComp);
				dfs(i);
				System.out.printf("\n");
			}
		System.out.printf("There are %d connected components\n", numComp);
	}
}
