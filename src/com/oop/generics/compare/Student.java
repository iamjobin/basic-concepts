package com.oop.generics.compare;

public class Student implements Comparable<Student> {

    private int no;

    private int mark;

    public Student(int no, int mark) {
        this.no = no;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return this.mark - o.mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", mark=" + mark +
                '}';
    }
}
