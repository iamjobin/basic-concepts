package com.dsa.linkedlist;

public class CLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            node.next = node;
        } else {
            Node t = head;
            while (t.next != head) {
                t = t.next;
            }
            node.next = head;
            t.next = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        if(head==null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while (temp.next!=head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next =head;
    }

    public void remove(int val) {
        if (head==null) {
            return;
        }
        Node current = head;
        Node prev = null;
        do {
            if(current.val==val) {
                if (prev == null) {
                    Node t =head;
                    while (t.next != head) {
                        t = t.next;
                    }
                    head=head.next;
                    t.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    private Node findNode(int val) {
        Node t = head;
        do {
            if (t.val == val) return t;
            t = t.next;
        } while (t!=head);
        return null;
    }

    public void disp() {
        Node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("END");
    }

    private class Node {

        int val;

        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}
