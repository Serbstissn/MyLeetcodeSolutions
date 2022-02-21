package com.sebcio.leet_questions.easy;

public class MergeTwoSortedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        // Iterative solution - a lot of code
        // if (list1 == null) {
        //     return list2;
        // }

        // if (list2 == null) {
        //     return list1;
        // }

        // ListNode newHead;

        // if (list1.getValue() <= list2.getValue()) {
        //     newHead = list1;
        //     list1 = list1.next();
        // } else {
        //     newHead = list2;
        //     list2 = list2.next();
        // }

        // ListNode nextNode = newHead;

        // while(list1 != null || list2 != null){
        //     if(list1 == null){
        //         nextNode.setNext(list2);
        //         list2 = null;
        //     }else if(list2 == null){
        //         nextNode.setNext(list1);
        //         list1 = null;
        //     }else if(list1.getValue() <= list2.getValue()){
        //         nextNode.setNext(list1);
        //         list1 = list1.next();
        //     }else{
        //         nextNode.setNext(list2);
        //         list2 = list2.next();
        //     }
        //     nextNode = nextNode.next();
        // }

        // return newHead;


        // Recursive solution - more concise
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.getValue() <= list2.getValue()){
            list1.setNext(mergeTwoLists(list1.next(), list2));
            return list1;
        }else{
            list2.setNext(mergeTwoLists(list1, list2.next()));
            return list2;
        }
    }
}
