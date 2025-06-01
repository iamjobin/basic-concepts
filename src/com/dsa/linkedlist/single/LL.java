package com.dsa.linkedlist.single;

public class LL {

    private Node head;

    private Node tail;

    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.setNext(head);
        head = node;
        if (tail == null) {
            tail = head;
        }
        size +=1;

    }

    public void insertLast(int val) {
        if (tail == null) {
           insertFirst(val);
           return;
        }
        Node node = new Node(val);
        tail.setNext(node);
        tail = node;
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i=1; i<index; i++) {
            temp = temp.getNext();
        }
        Node node = new Node(val, temp.getNext());
        temp.setNext(node);
        size++;
    }

    public void deleteFirst() {
        head = head.getNext();
        size--;
        if (head==null) {
            tail = null;
        }
    }

    public void deleteLast() {
        if(size<2) {
            deleteFirst();
        }
        Node node = get(size - 2);
        node.setNext(null);
        tail = node;
        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size-1) {
            deleteLast();
            return;
        }
        Node node = get(index-1);
        node.setNext(node.getNext().getNext());
        size--;
    }

    public Node findByValue(int val) {
        Node node = head;
        while (node!=null) {
            if(node.getValue() == val) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i=0; i<index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void disp() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.print("END");
        System.out.println();
    }

    public LL() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
