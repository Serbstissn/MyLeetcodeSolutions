package com.sebcio.leet_questions.easy;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {

        // Storing values in a list and then check for palindrome
        // Complexity: time O(n) , space O(n)
        // List<Integer> valueList = new ArrayList<>();
        // ListNode currentNode = head;
        // valueList.add(currentNode.getValue());

        // while (currentNode.next() != null) {
        //     currentNode = currentNode.next();
        //     valueList.add(currentNode.getValue());
        // }

        // int leftIndex = 0;
        // int rightIndex = valueList.size() - 1;

        // while (leftIndex < rightIndex) {
        //     if (valueList.get(leftIndex++) != valueList.get(rightIndex--))
        //         return false;
        // }

        // return true;


        // Two pointers and reverse solution , which destroys original list
        // Complexity : time O(n) , space O(1)

        ListNode slow = head;
        ListNode fast = head;
        ListNode reverse = null;
        ListNode tmp = null;

        while(fast != null && fast.next() != null){
            tmp = reverse;
            reverse = slow;
            slow = slow.next();
            fast = fast.next().next();
            reverse.setNext(tmp);
            
        }

        // if there is even number of elements than fast should be null
        // if odd number of elements fast is not null and we should move slow by one step
        if(fast != null)
            slow = slow.next();

        while(reverse!= null && reverse.getValue() == slow.getValue()){
            reverse = reverse.next();
            slow = slow.next();
        }

        // if reverse null that means that comparison get to the end and both halves are the same
        return reverse == null;

    }

}
