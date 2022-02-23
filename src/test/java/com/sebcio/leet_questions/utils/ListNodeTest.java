package com.sebcio.leet_questions.utils;

import static org.assertj.core.api.Assertions.*;

import com.sebcio.leet_questions.utils.ListNode;
import org.junit.jupiter.api.Test;

public class ListNodeTest {

    @Test
    void oneNodeShouldReturnNullOnNext(){
        ListNode newNode = new ListNode(1);

        assertThat(newNode.next()).isEqualTo(null);
        assertThat(newNode.val).isEqualTo(1);
    }

    @Test
    void setNextReferenceShouldReturnReference(){
        //given
        ListNode headNode = new ListNode(1);
        ListNode nextNode = new ListNode(2);

        //when
        headNode.setNext(nextNode);

        //then
        assertThat(headNode.next()).isEqualTo(nextNode);

    }
}
