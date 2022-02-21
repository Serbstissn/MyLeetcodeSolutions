package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MergeTwoSortedListTest {

    @Test
    void shouldReturnCorrectValue() {
        // given
        // List1
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);

        // List2
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        // when
        node1.setNext(node2);
        node2.setNext(node3);

        node4.setNext(node5);
        node5.setNext(node6);

        ListNode newHead = MergeTwoSortedList.mergeTwoLists(node1, node4);

        // then
        assertThat(newHead).isEqualTo(node1);
        assertThat(makeNodeList(newHead)).containsExactly(node1, node4, node2, node5, node3, node6);

    }

    private List<ListNode> makeNodeList(ListNode head) {
        List<ListNode> result = new ArrayList<>();
        while (head != null) {
            result.add(head);
            head = head.next();
        }

        return result;
    }
}
