package com.problems.leetcode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l = ListNode.createList(new int[]{
                1,3,4
        });
        System.out.println(reverseList(l));
    }

    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
