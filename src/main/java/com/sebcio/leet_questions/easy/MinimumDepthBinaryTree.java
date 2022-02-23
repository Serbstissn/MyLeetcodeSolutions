package com.sebcio.leet_questions.easy;

import com.sebcio.leet_questions.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBinaryTree {

    public static int minDepth(TreeNode root) {

        // DFS - by idea it search through depth of branches , but in 
        // unbalanced tree it takes way more operations to determine the results
        // than BFS approach

        // common element for all solutions
        if (root == null)
            return 0;

        // return measureDepth(root, 1); // <- used in my solution
    
        // depth of branches to the left and to the right
        // int left = minDepth(root.left);
        // int right = minDepth(root.right);

        // if no branches to the left or right return the length of second one , else min of both branches
        // return (left == 0 || right == 0)?left + right + 1: Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    
        
        //BFS solution
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int depth = 0;

        while(!nodeQueue.isEmpty()){
            depth += 1;
            int n = nodeQueue.size();
            for(int i = 0; i < n ; i++){
                TreeNode currNode = nodeQueue.poll();
                if(currNode.left == null && currNode.right == null){
                    return depth;
                }
                if(currNode.left != null)
                    nodeQueue.offer(currNode.left);
                if(currNode.right != null)
                    nodeQueue.offer(currNode.right);
            }
        }
        return depth;
        
    }

    /**
     * Helper method for my DFS solution
     * @param root
     * @param depth
     * @return
     */
    private static int measureDepth(TreeNode root, int depth) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (root.left == null && root.right == null) {
            return depth;
        } else
            return Math.min(measureDepth(root.left, depth + 1), measureDepth(root.right, depth + 1));

    }
}
