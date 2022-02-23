package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import com.sebcio.leet_questions.utils.TreeNode;
import org.junit.jupiter.api.Test;

public class PathSumTest {

    @Test
    void shouldReturnCorrectValue() {
        // given
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(1);
        //then
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        node5.setRight(node8);

        assertThat(PathSum.hasPathSum(root, 22)).isTrue();

    }
}
