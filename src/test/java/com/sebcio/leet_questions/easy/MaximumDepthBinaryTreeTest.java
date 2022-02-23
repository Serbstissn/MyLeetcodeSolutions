package com.sebcio.leet_questions.easy;

import com.sebcio.leet_questions.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaximumDepthBinaryTreeTest {

    @Test
    void shouldReturnCorrectValue(){

        //given
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        //when
        root.setLeft(node1);
        root.setRight(node2);
        node2.setLeft(node3);
        node2.setRight(node4);


        assertThat(MaximumDepthBinaryTree.maxDepth(root)).isEqualTo(3);

    }

}