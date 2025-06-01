package com.oop.access;

public class ObjectDemo {

    int n;

    public ObjectDemo(int n) {
        this.n = n;
    }

//    Unique number representation of object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



//  a string representation of the object.
    @Override
    public String toString() {
        return super.toString();
    }

//    not there ion java21
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
