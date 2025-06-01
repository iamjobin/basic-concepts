package com.problems.leetcode;

//Problem Link : https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeLL {

    public static void main(String[] args) {
        ListNode l1 = createList(new int[]{
                1,2,4
        });

        ListNode l2 = createList(new int[]{
                1,3,4
        });
        System.out.println(mergeTwoLists(l1, l2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 ==null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (list1 != null && list2!=null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1!=null) {
            current.next = list1;
        }
        if (list2!=null) {
            current.next = list2;
        }
        return dummy.next;
    }

    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

}
