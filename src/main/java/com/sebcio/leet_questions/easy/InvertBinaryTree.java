package com.sebcio.leet_questions.easy;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    /**
     * Given the root of a binary tree, invert the tree, and return its root
     *
     * @param root of original binary tree
     * @return root of inverted binary tree
     */
    public TreeNode invertTree(TreeNode root) {

//        // my DFS solution
//        if(root == null) return null;
//
//        // switch left and right branch
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//
//        // recursively go through whole tree - DFS algorithm
//        invertTree(root.left);
//        invertTree(root.right);
//
//        return root;

        // BFS solution
        // go through all nodes in a tree and switch their left and right branch
        if (root == null) return null;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()) {
            int n = nodeQueue.size();
            for (int i = 0; i < n; i++) {
                TreeNode currNode = nodeQueue.poll();
                if (currNode.left != null) nodeQueue.offer(currNode.left);
                if (currNode.right != null) nodeQueue.offer(currNode.right);
                TreeNode tmp = currNode.left;
                currNode.left = currNode.right;
                currNode.right = tmp;
            }
        }
        return root;
    }
}
