package com.xworkz.assignment;

public class AddTarget {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 5;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }

     static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

}