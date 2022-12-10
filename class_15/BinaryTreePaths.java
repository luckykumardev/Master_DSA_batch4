package class_15;

import java.util.ArrayList;
import java.util.List;
/*
 https://leetcode.com/problems/binary-tree-paths/
*/

public class BinaryTreePaths {

	public List<String> binaryTreePaths(Node root) {
	        List<String> res = new ArrayList<>();    
	        if(root == null) return res;
	        findPath(root, res, "");
	        return res;
	    }
	    
	    private static void findPath(Node root, List<String> res, String s){
	        if(root == null) return;
	        if(root.left == null && root.right == null){
	            res.add(s+root.val);
	            return;
	        }
	        s = s + root.val+"->";
	        findPath(root.left,  res, s);
	        findPath(root.right, res, s);
	    }
	    
	    
	  /* 
	   * public List<String> binaryTreePaths(TreeNode root) {
	        List<String> res = new ArrayList<>();    
	        if(root == null) return res;
	      StringBuilder sb= new StringBuilder();
          findPath(root, res, sb);
	        
	        return res;
	    }
	    
	    private static void findPath(TreeNode root, List<String> res, StringBuilder sb){
	        if(root == null) return;
	        if(root.left == null && root.right == null){
	            res.add(sb.toString() + root.val);
	            sb.deleteCharAt(sb.length()-1);
                return;
	        }
            
	        sb.append(root.val+"->");
	        findPath(root.left,  res, sb);            
            findPath(root.right, res, sb);  
            sb.deleteCharAt(sb.length()-1);
	    }
	  */
}
