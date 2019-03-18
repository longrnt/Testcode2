package leetCode;

//JAVA program to print all 
//paths from a source to
//destination.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//A directed graph using
//adjacency list representation
public class Leet75_PrintAllPath {


    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    	int s = 0, v = graph.length - 1;
    	
    	// adjacency list
    	ArrayList<Integer>[] adjList = new ArrayList[graph.length];

		for (int i = 0; i < graph.length; i++) {
			adjList[i] = new ArrayList<>();
		}
		
    	for (int i = 0; i < graph.length; i++) {
    		for (int j = 0; j < graph[i].length; ++j) {
    			adjList[i].add(graph[i][j]);
    		}
    	}

    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
		boolean[] isVisited = new boolean[graph.length];
		ArrayList<Integer> pathList = new ArrayList<>();

		// add source to path[]
		pathList.add(s);

		// Mark the current node
		isVisited[s] = true;
		
		printAllPathsUtil(result, s, v, isVisited, pathList, adjList);
		
        return result;
    }
    
    private static ArrayList<Integer> makeDeepCopyInteger(List<Integer> localPathList){
        ArrayList<Integer> copy = new ArrayList<Integer>(localPathList.size());
        for(Integer i : localPathList){
            copy.add(new Integer(i));
        }
        return copy;
    }
    

	// A recursive function to print
	// all paths from 'u' to 'd'.
	// isVisited[] keeps track of
	// vertices in current path.
	// localPathList<> stores actual
	// vertices in the current path
	private static void printAllPathsUtil(List<List<Integer>> result,
			Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList, ArrayList<Integer>[] adjList) {

		// Mark the current node
		isVisited[u] = true;

		if (u.equals(d)) {
			result.add(makeDeepCopyInteger(localPathList));
		}

		// Recur for all the vertices
		// adjacent to current vertex
		for (Integer i : adjList[u]) {
			if (!isVisited[i]) {
				// store current node
				// in path[]
				localPathList.add(i);
				printAllPathsUtil(result, i, d, isVisited, localPathList, adjList);

				// remove current node
				// in path[]
				localPathList.remove(i);
			}
		}

		// Mark the current node
		isVisited[u] = false;
	}

	// Driver program
	public static void main(String[] args) {
//		[[1,2], [3], [3], []]
//		List<List<Integer>> allPathsSourceTarget(int[][] graph
		int[][] graph = new int[4][];
		graph[0] = new int[]{1,2};
		graph[1] = new int[]{3};
		graph[2] = new int[]{3};
		graph[3] = new int[]{};
		
		System.out.println(graph);
		List<List<Integer>> result = allPathsSourceTarget(graph);
		
		System.out.println(result);
	}
}