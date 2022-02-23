package com.sebcio.leet_questions.utils;

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
    
    public int val;

    public ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }

    // wrapper for getter
    public ListNode next(){
        return getNext();
    }
}
