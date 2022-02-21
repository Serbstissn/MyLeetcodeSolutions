package com.sebcio.leet_questions.easy;

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

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
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
