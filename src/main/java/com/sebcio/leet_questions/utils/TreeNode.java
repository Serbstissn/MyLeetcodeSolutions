package com.sebcio.leet_questions.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Helper class for exercises with binary trees
 */
@Getter
@Setter
@ToString(exclude = {"left" , "right"})
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int value(){
        return getVal();
    }

    public TreeNode left(){
        return getLeft();
    }

    public TreeNode right(){
        return getRight();
    }
}
