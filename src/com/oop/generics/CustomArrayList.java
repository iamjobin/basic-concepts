package com.oop.generics;

import java.util.Arrays;

public class CustomArrayList<T> {

    private Object[] arr;

    private static final int DEFAULT_SIZE = 10;

    public int size = 0;

    public CustomArrayList() {
        this.arr = new Object[DEFAULT_SIZE];
    }

    public T get(int index) {
        return (T)(arr)[index];
    }

    public void add(T value) {
        if(size >= arr.length) {
            Object[] temp = new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size] = value;
        size +=1;
    }

    public void remove() {
        arr[size--] = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        System.out.println(list);
        for(int i = 1; i<15; i++) {
            list.add(i + "Hello");
        }
        System.out.println(list.get(13));
        System.out.println(list);

    }

}
