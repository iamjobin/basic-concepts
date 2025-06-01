package com.problems.leetcode;

//Problem Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthFromEndOfLL {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)
                                )
                        )
                )
        );
        ListNode head2 = new ListNode(1,
                new ListNode(2)
        );
        ListNode head1 = new ListNode(1);
        removeNthFromEnd(head2, 1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }
        ListNode temp = head;
        int size = 0;
        while (temp!=null) {
            temp = temp.next;
            size += 1;
        }
        System.out.println(size);
        int newN = size+1-n;
        temp = head;

        if(newN==1) {
            head = head.next;
            return head;
        }
        for (int i=2; i<newN; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}


