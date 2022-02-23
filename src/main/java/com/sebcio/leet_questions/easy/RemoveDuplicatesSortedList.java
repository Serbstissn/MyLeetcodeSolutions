package com.sebcio.leet_questions.easy;

import com.sebcio.leet_questions.utils.ListNode;

public class RemoveDuplicatesSortedList {
    
    public static ListNode deleteDuplicates(ListNode head) {
        
        // Solution with pointer
        ListNode currentNode = head;

        while(currentNode != null && currentNode.next() != null){
            if(currentNode.val == currentNode.next().val)
                currentNode.setNext(currentNode.next().next());
            else
                currentNode = currentNode.next();
        }

        return head;


        // Recursive solution
        // does NOT work with a test because it leaves LAST occurrence of element
        // and test checks if first occurrence is preserved, but when it comes to nodes values
        // result is the same

        // if(head == null || head.next() == null)
        //     return head;

        // head.setNext(deleteDuplicates(head.next()));

        // return head.getValue() == head.next().getValue()?head.next():head;
    }
}
