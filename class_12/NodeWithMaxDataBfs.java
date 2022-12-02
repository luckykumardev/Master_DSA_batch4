package class_12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NodeWithMaxDataBfs {

	public static void main(String[] args) {
		TreeNode root  = new TreeNode(100);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(200);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(node4);	
		node1.children.add(node5);	
		int ans = maxNodeBfs(root);
	    System.out.println(ans);
	}
	
	public static int maxNodeBfs(TreeNode root) {
	    
		    if(root ==  null) return 0;
	        int ans = Integer.MIN_VALUE;
		    Queue<TreeNode> q = new LinkedList();
	        q.add(root);
	        while(!q.isEmpty()){
	           int size = q.size();
	           List<Integer> curr = new ArrayList<>();
	           for(int i =0; i <size; i++){
	               TreeNode temp = q.poll();
                   ans = Math.max(ans, temp.data);
	               for(int j =0; j<temp.children.size(); j++)
	                  q.add(temp.children.get(j));
	            }   
	        }
	   return ans;    
	}

}
