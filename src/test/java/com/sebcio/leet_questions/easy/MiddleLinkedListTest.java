package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.*;

import com.sebcio.leet_questions.utils.ListNode;
import org.junit.jupiter.api.Test;


public class MiddleLinkedListTest {

    @Test
    void shouldReturnCorrectValue() {
        //given
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);



        // when
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        //then
        assertThat(MiddleLinkedList.middleNode(node1)).isEqualTo(node4);
    }

}
