package com.sebcio.leet_questions.easy;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {

        // using HashSet to remember already visited nodes
        // Complexity- time: O(n) , space: O(n)
        // Set<ListNode> alreadyVisited = new HashSet<>();

        // ListNode currentNode = head;
        // boolean noCycle = true;
        // while ((currentNode.next() != null) && (noCycle)) {
        //     noCycle = alreadyVisited.add(currentNode);
        //     currentNode = currentNode.next();
        // }
        // return !noCycle;

        //Solution with two pointers one faster than the other , if they meet there is a cycle
        // Complexity - time: O(n) , space: O(1)
        if(head == null){
            return false;
        }

        ListNode walker = head;
        ListNode runner = head;
        while((runner.next() != null) && (runner.next().next() != null)){
            walker = walker.next();
            runner = runner.next().next();
            if(walker == runner)
                return true;
        }
        return false;
    }
}
