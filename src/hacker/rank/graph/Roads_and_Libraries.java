package hacker.rank.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Roads_and_Libraries {

	private static final int DFS_WHITE = -1; // normal DFS
	private static final int DFS_BLACK = 1;
	private static Vector<Vector<Integer>> AdjList = new Vector<Vector<Integer>>();
	private static Vector<Integer> dfs_num;
	private static int numComp;
	private static long totalCityCount;
	
	private static void initDFS(int V) { // used in normal DFS
		dfs_num = new Vector<Integer>();
		dfs_num.addAll(Collections.nCopies(V, DFS_WHITE));
		numComp = 0;
		totalCityCount = 0;
	}
	
	private static void dfs(int u) { // DFS for normal usage
		System.out.printf(" %d", u); // this vertex is visited
		totalCityCount++;
		dfs_num.set(u, DFS_BLACK); // mark as visited
		Iterator it = AdjList.get(u).iterator();
		while (it.hasNext()) { // try all neighbors v of vertex u
			Integer v = (Integer) it.next();
			if (dfs_num.get(v) == DFS_WHITE) // avoid cycle
				dfs(v); // v is a (neighbor, weight) pair
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {

		int i, j, V, total_neighbors, id;
		long weight, clib;
		
		File f = new File("src/hacker/rank/graph/input.txt");

		
//		 Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(f);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            V = in.nextInt();
            total_neighbors = in.nextInt();
            clib = in.nextLong();
            weight = in.nextLong();
            
            AdjList.clear();
            for (i = 0; i < V; i++) {
            	Vector<Integer> Neighbor = new Vector<Integer>();
            	AdjList.add(Neighbor); // store blank vector first
            }
            
            for(int a1 = 0; a1 < total_neighbors; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                
                AdjList.get(city_1 - 1).add(new Integer(city_2 - 1));
            }
            
            initDFS(V); // call this first before running DFS
            
            long totalFee = 0;
            
    		for (i = 0; i < V; i++) // for each vertex i in [0..V-1]
    			if (dfs_num.get(i) == DFS_WHITE) { // if not visited yet
    				System.out.printf("Component %d, visit:", ++numComp);
    				dfs(i);
    				System.out.println();
    				
    				totalFee += ((totalCityCount - 1) * weight) + clib;
    				System.out.println("totalCityCount = " + totalCityCount);
    				
    				totalCityCount = 0;
    			}
    		if (totalFee < V * clib) {
    			System.out.println(totalFee);
    		} else {
    			System.out.println(V * clib);
    		}
    		System.out.printf("There are %d connected components\n\n", numComp);
        }
	}

}
