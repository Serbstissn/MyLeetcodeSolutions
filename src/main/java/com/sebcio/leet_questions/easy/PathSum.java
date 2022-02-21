package com.sebcio.leet_questions.easy;

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(targetSum - root.val == 0 && (root.left == null && root.right == null)) return true;

        int diff = targetSum - root.val;
        
        return hasPathSum(root.left, diff) || hasPathSum(root.right, diff);
    }
}
