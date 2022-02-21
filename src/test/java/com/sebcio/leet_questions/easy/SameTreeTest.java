package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SameTreeTest {

    @Test
    void shouldReturnCorrectValue(){
        //given
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);

        TreeNode root3 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);

        //when
        root.setLeft(node1);
        root.setRight(node2);

        root2.setLeft(node4);

        root3.setRight(node5);

        //then
        assertThat(SameTree.isSameTree(root , root)).isTrue();
        assertThat(SameTree.isSameTree(root2 , root3)).isFalse();



    }
}
