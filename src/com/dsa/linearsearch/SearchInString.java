package com.dsa.linearsearch;

public class SearchInString {

    public static void main(String[] args) {
        String name = "JOBIN";
        char target = 'O';
        boolean isFound = search(name, target);
        if(isFound) {
            System.out.println("Target "+ target + " was found in the given String.");
        } else {
            System.out.println("Target was not found in the given String.");
        }
    }

    private static boolean search(String name, char target) {
        if(name.isEmpty() ){
            return false;
        }
        for (char c : name.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }

}
