package com.sebcio.leet_questions.easy;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q==null) return p == q;
        if(p.val != q.val) return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
