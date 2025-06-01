package com.example;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println("Majority element : " + majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int majorityElement = -1;
        int maxCount = 0;
        for (int i=0; i<nums.length; i++) {
            int element = nums[i];
            if(countMap.containsKey(element)) {
                int newCount = countMap.get(element) +1;
                if(newCount > maxCount){
                    majorityElement= element;
                    maxCount = newCount;
                }
                countMap.put(element,newCount);
            } else {
                if(maxCount == 0 ) {
                    majorityElement= element;
                }
                countMap.put(element, 1);
            }
        }
        return majorityElement;
    }
}
