package com.sebcio.leet_questions.easy;


public class LowestCommonAncestorBinarySearchTree {


    /**
     * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
     * <p>
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
     *
     * @param root of tree
     * @param p    tree node
     * @param q    tree node
     * @return lowest common ancestor tree node
     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // make sure that p has always smaller value than q
        if( p.val > q.val ){
            TreeNode tmp = q;
            q = p;
            p = tmp;
        }

        // if both target nodes are smaller than root move to the left
        if(q.val < root.val) return lowestCommonAncestor(root.left , p , q);
        // if both target nodes are bigger than root move to the right
        if(p.val > root.val) return lowestCommonAncestor(root.right, p , q);

        // otherwise, root is between target nodes (or one of them) and is the lowest common ancestor
        return root;
    }


}
