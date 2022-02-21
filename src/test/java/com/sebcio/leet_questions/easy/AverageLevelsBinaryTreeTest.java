package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AverageLevelsBinaryTreeTest {

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

        assertThat(AverageLevelsBinaryTree.averageOfLevels(root)).containsExactly(3.0d , 14.5d, 11.0d);


    }
}
