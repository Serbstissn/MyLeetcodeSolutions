package com.sebcio.leet_questions.easy;

import com.sebcio.leet_questions.utils.TreeNode;

public class SubtreeOfAnotherTree {
    /**
     * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
     * <p>
     * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
     *
     * @param root    of the tree
     * @param subRoot root of potential subtree
     * @return true if is subtree
     */
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) return false;
        if (isSame(root, subRoot)) return true;
        else return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    /**
     * Helper method checking if two trees are the same
     *
     * @param root    of the first tree
     * @param subRoot root of second tree
     * @return true if trees are the same
     */
    private static boolean isSame(TreeNode root, TreeNode subRoot) {

        if (root == null || subRoot == null) return root == subRoot;

        if (root.val != subRoot.val) return false;
        else return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }
}
