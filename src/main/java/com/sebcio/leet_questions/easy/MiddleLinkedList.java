package com.sebcio.leet_questions.easy;

public class MiddleLinkedList {
    
    public static ListNode middleNode(ListNode head) {


        // my code , similar in idea to next solution
        // ListNode middleNode = head;
        // ListNode lastNode = head;
        // int count = 1;

        // while(lastNode.next() != null){
        //     lastNode = lastNode.next();
        //     count++;
        //     if(count%2 == 0){
        //         middleNode = middleNode.next();
        //     }
        // }
        
        // return middleNode;


        // Solution - two pointers - fast moving 2 steps and slow moving 1 step
        // when fast arrives at the end of list slow is in the middle

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next() != null){
            fast = fast.next().next();
            slow = slow.next();
        }

        return slow;

    }

}
