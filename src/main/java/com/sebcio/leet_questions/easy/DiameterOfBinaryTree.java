package com.sebcio.leet_questions.easy;

public class DiameterOfBinaryTree {

    //    global variable for storing max diameter
    private static int max;

    /**
     * Given the root of a binary tree, return the length of the diameter of the tree.
     * <p>
     * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
     * <p>
     * The length of a path between two nodes is represented by the number of edges between them.
     *
     * @param root of the tree
     * @return diameter of binary tree
     */
    public static int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        maxDepth(root);
        return max;
    }

    /**
     * Helper method that calculates the longest branches for each node
     * additionally it compares its longest left and right branch sum with current max
     * diameter
     *
     * @param root of the tree
     * @return longest branch in a tree
     */
    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;

    }


}
