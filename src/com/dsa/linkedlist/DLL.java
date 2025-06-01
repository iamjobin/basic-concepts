package com.dsa.linkedlist;

public class DLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
           head.prev = node;
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
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void insert(int after, int val) {
        Node prevNode = findNode(after);
        if (prevNode != null) {
            Node node = new Node(val);
            Node nextNode = prevNode.next;

            prevNode.next = node;
            node.prev = prevNode;

            if (nextNode != null) {
                nextNode.prev = node;
                node.next = nextNode;
            }
        }
    }

    private Node findNode(int val) {
        Node r = head;
        while (r != null) {
            if (r.val==val) return r;
            r = r.next;
        }
        return null;
    }

    public void disp() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println();
        System.out.println("_______In Reverse Order_______");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    class Node {

        int val;

        Node next;

        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

}


