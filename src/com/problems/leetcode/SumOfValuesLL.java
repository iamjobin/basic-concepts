package com.problems.leetcode;

//Problem Link : https://leetcode.com/problems/add-two-numbers/description/
public class SumOfValuesLL {

    public static void main(String[] args) {
        ListNode l1 = createList(new int[]{
                1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1
        });

        ListNode l2 = createList(new int[]{
                5,6,4
        });


        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            t.next = new ListNode(sum%10);
            if(sum>9){
                carry = 1;
            }else{
                carry = 0;
            }
            t = t.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry == 1) {
            t.next = new ListNode(1);
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


