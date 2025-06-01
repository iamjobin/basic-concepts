package com.oop.generics;

import java.util.Arrays;

public class CustomArrayListWildCard<T extends Number> {

    private Object[] arr;

    private static final int DEFAULT_SIZE = 10;

    public int size = 0;

    public CustomArrayListWildCard() {
        this.arr = new Object[DEFAULT_SIZE];
    }

    public T get(int index) {
        return (T)(arr)[index];
    }

    public void add(T value) {
        if(size >= arr.length) {
            Object[] temp = new Object[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
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
        CustomArrayListWildCard<Integer> list = new CustomArrayListWildCard<>();
        System.out.println(list);
        for(int i = 1; i<15; i++) {
            list.add(i);
        }
        System.out.println(list.get(13));
        System.out.println(list);

    }

}
