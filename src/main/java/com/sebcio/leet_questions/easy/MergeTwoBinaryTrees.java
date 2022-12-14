package com.sebcio.leet_questions.easy;

import com.sebcio.leet_questions.utils.TreeNode;

public class MergeTwoBinaryTrees {

    /**
     * You are given two binary trees root1 and root2.
     * <p>
     * Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.
     * <p>
     * Return the merged tree.
     * <p>
     * Note: The merging process must start from the root nodes of both trees
     *
     * @param root1 of first tree
     * @param root2 of second tree
     * @return  root of merged tree
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        // base case if we have one root and not the other return root that is present
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        // merging when two roots are present
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left , root2.left);
        root1.right = mergeTrees(root1.right , root2.right);

        // return root of first tree , because this one is result of merging
        return root1;
    }

}
