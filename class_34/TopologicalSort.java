package class_34;

import java.util.ArrayList;
import java.util.Stack;

/*
 https://practice.geeksforgeeks.org/problems/topological-sort/1
*/
public class TopologicalSort {

	public static int[] topoSort(int N, ArrayList<ArrayList<Integer>> adj) {
		int ans[] = new int[N];
		Stack<Integer> s = new Stack<>();
		boolean visited[] = new boolean[N];
		for (int i = 0; i < N; i++)
			if (visited[i] == false) {
				visited[i] = true;
				topo(i, visited, adj, s);
			}
		int k = 0;
		while (!s.isEmpty())
			ans[k++] = s.pop();
		return ans;

	}

	private static void topo(int i, boolean visited[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> s) {
		ArrayList<Integer> children = adj.get(i);
		for (int j = 0; j < children.size(); j++) {
			int x = children.get(j);
			if (visited[x] == false) {
				visited[x] = true;
				topo(x, visited, adj, s);
			}
		}
		s.push(i);
	}
}