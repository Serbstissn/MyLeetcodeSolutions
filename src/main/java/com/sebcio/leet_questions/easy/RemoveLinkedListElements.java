package com.sebcio.leet_questions.easy;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {

        // My solution, consuming list nodes with specified values using pointers
        // Complexity: time: O(n) , space: O(1)
        // while (head != null && head.getValue() == val) {
        // head = head.next();
        // }

        // ListNode pointer = head;

        // while (pointer != null && pointer.next() != null) {
        // if (pointer.next().getValue() == val) {
        // pointer.setNext(pointer.next().next());
        // } else
        // pointer = pointer.next();
        // }

        // return head;

        // Solution with recursion - similar complexity

        if (head == null)
            return null;
        
        head.setNext(removeElements(head.next(), val));
        return head.getValue() == val ? head.next() : head;
    }

}
