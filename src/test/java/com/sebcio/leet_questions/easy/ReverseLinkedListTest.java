package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import com.sebcio.leet_questions.utils.ListNode;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    @Test
    void shouldReturnCorrectValue() {
        // given
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // when
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        ListNode newHead = ReverseLinkedList.reverseList(node1);

        // then
        assertThat(newHead).isEqualTo(node5);
        assertThat(makeNodeList(newHead)).containsExactly(node5, node4, node3, node2, node1);

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
