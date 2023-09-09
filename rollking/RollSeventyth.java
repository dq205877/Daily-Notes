package rollking;

import java.util.ArrayList;
import java.util.List;

public class RollSeventyth {
    
    public static void main(String[] args) {
        TreeNode left = new TreeNode(9,new TreeNode(5),new TreeNode(1));
        TreeNode root = new TreeNode(4,left,new TreeNode(0));
        System.out.println(sumNumbers(root));
    }
    public static int sumNumbers(TreeNode root) {
        List<StringBuilder> list = new ArrayList();
        getAllPath(list,root);
        int sum = 0;
        for(StringBuilder a : list){
            sum += Integer.valueOf(a.toString());
        }
        return sum;
    }

    private static void getAllPath(List<StringBuilder> list,TreeNode root){
        if(root != null){
            StringBuilder a = new StringBuilder(""+root.val);
            if(root.left != null && root.right != null){
                StringBuilder b = new StringBuilder(a);
                append(a,root.left,list);
                append(b,root.right,list);
            } else if (root.left != null){
                append(a,root.left,list);            
            } else if (root.right != null){
                append(a,root.right,list);            
            } else {
                list.add(a);
            }
        } 
    }

    private static void append(StringBuilder a, TreeNode root,List<StringBuilder> list){
            a.append(root.val);
            if(root.left == null && root.right == null){
                list.add(a);
            } else if(root.left != null && root.right != null){
                StringBuilder b = new StringBuilder(a);
                append(b,root.left,list);
                append(a,root.right,list);
            } else if (root.right != null){
                append(a,root.right,list);
            } else if (root.left != null){
                append(a,root.left,list);
            }
    }

    /**
 * Definition for a binary tree node.
*/
  static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
  }
}
