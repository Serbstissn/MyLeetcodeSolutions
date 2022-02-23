package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import com.sebcio.leet_questions.utils.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesSortedListTest {

    @Test
    void shouldReturnCorrectValue() {
        // given
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode nodex = new ListNode(2);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(3);

        // when
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(nodex);
        nodex.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        ListNode newHead = RemoveDuplicatesSortedList.deleteDuplicates(node1);

        // then
        assertThat(newHead).isEqualTo(node1);
        assertThat(makeNodeList(newHead)).containsExactly(node1, node3, node5);

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
