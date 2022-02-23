package com.sebcio.leet_questions.easy;

import com.sebcio.leet_questions.utils.TreeNode;

public class MaximumDepthBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
