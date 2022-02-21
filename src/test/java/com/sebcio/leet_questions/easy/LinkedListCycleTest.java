package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

    @Test
    void shouldReturnCorrectValue() {
        //given
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);

        // when
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node2);

        //then
        assertThat(LinkedListCycle.hasCycle(node1)).isTrue();
    }

}
