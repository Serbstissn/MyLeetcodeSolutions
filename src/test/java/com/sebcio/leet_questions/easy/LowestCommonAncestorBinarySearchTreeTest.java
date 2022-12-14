package com.sebcio.leet_questions.easy;

import com.sebcio.leet_questions.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class LowestCommonAncestorBinarySearchTreeTest {

    @Test
    void shouldReturnCorrectValue(){
        //given
        TreeNode root = new TreeNode(6);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(5);

        //when
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;

        //then
        assertThat(LowestCommonAncestorBinarySearchTree.lowestCommonAncestor(root , node1 , node2)).isEqualTo(root);
        assertThat(LowestCommonAncestorBinarySearchTree.lowestCommonAncestor(root , node8 , node3)).isEqualTo(node1);

    }
}