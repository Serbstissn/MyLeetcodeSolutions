package com.sebcio.leet_questions.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsBinaryTree {

    public static List<Double> averageOfLevels(TreeNode root) {

        // DFS - Depth - First search
        // Recursive algorithm - O(n) - time complexity
        // List<Double> result = new ArrayList<>();
        // List<Integer> count = new ArrayList<>();

        // calculateAverage(root, 0, result, count);

        // for (int i = 0; i < result.size(); i++) {
        // Double avg = result.get(i) / count.get(i);
        // result.set(i, avg);
        // }
        // return result;

        // BFS - Breadth - First search
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                TreeNode currentNode = queue.poll();
                sum += currentNode.val;
                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            result.add(sum / n);
        }

        return result;

    }

    private static void calculateAverage(TreeNode root, int index, List<Double> sum, List<Integer> count) {

        System.out.println("Calculations for root : index " + root.val + " : " + index);

        if (index < sum.size()) {
            sum.set(index, sum.get(index) + root.val);
            count.set(index, count.get(index) + 1);
        } else {
            sum.add((double) root.val);
            count.add(1);
        }

        if (root.left != null) {
            calculateAverage(root.left, index + 1, sum, count);
        }
        if (root.right != null) {
            calculateAverage(root.right, index + 1, sum, count);
        }

    }
}