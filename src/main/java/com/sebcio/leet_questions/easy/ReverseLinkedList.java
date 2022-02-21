package com.sebcio.leet_questions.easy;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        
        // Iterative solution

        // ListNode first = head;
        // ListNode second = null;

        // while(first != null){
        //     ListNode tmp = second;
        //     second = first;
        //     first = first.next();
        //     second.setNext(tmp);
        // }

        // return second;

        // Recursive solution        

        return recursiveReverse(head, null);
    }

    
    /**
     * Helper method for recursive solution
     * 
     * @param head
     * @param newHead
     * @return
     */
    private static ListNode recursiveReverse(ListNode head , ListNode newHead){

        if(head == null){
            return newHead;
        }

        ListNode next = head.next();
        head.setNext(newHead);

        return recursiveReverse(next, head);

    }
}
