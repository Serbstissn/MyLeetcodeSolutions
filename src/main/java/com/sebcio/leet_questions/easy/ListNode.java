package com.sebcio.leet_questions.easy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Class used for exercises with linked list
 */
@Setter
@Getter
@AllArgsConstructor
public class ListNode {
    
    private int value;

    private ListNode next;

    public ListNode(int val){
        this.value = val;
        this.next = null;
    }

    // wrapper for getter
    public ListNode next(){
        return getNext();
    }
}
