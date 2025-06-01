package com.dsa.linkedlist;

import com.dsa.linkedlist.single.LL;

public class Main {

    public static void main(String[] args) {
        circularLL();
    }

    public static void circularLL() {
        CLL list = new CLL();
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertLast(1);
        list.disp();
        list.remove(8);
        list.disp();
    }

    public static void doubleLL() {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertLast(1);
        list.insert(1,33);
        list.disp();;
    }

    public static void singleLL() {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertLast(2);
        list.insertFirst(1);
        list.insert(100, 3);
        list.disp();
        list.delete(1);
        list.disp();
        list.deleteFirst();
        list.deleteLast();
        list.disp();
        System.out.println(list.findByValue(1));
    }

}
