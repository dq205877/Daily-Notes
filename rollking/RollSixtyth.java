package rollking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class RollSixtyth {
    
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> levelList = new ArrayList(2 * queue.size());
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode node = queue.poll();
                levelList.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            list.add(levelList);
        }
        List<Double> result = new ArrayList();
        for(List<Integer> listElement : list){
            result.add(listElement.stream().mapToLong(e->e).average().getAsDouble());
        }
        return result;
    }

    /**
 * Definition for a binary tree node.
*/
  class TreeNode {
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
