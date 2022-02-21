package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class SubtreeOfAnotherTreeTest {

    @Test
    void shouldReturnCorrectValue() {
        //given
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        TreeNode root2 = new TreeNode(4);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(2);

        //when
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        root2.left = node6;
        root2.right = node7;

        //then
        assertThat(SubtreeOfAnotherTree.isSubtree(root , root2)).isTrue();

    }
}