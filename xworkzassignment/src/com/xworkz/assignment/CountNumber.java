package com.xworkz.assignment;

public class CountNumber {
    public static void main(String[] args) {
        int a[]={1,2,1,2,5,1,2};
        int target=2;
        int ans=count(a,target);
        System.out.println(ans);
    }
    static int count(int[] a, int target){
        int count=0;
        for(int i=0;i<a.length;i++) {
            if (target == a[i]) {
                count++;

            }


        }

        return count;
    }

}
