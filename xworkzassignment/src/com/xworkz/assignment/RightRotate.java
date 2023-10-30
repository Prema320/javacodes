package com.xworkz.assignment;

public class RightRotate {
    static void rotate(int a[], int n, int k) {
        for(int i = 0; i < n; i++) {
            if(i<k) {
                System.out.print(a[n + i - k]+" ");
            }
            else
            {
                System.out.print(a[i - k] + " ");
            }
        }
    }
    public static void main(String args[])
    {
        int a[] = {1, 2, 3, 4, 5};
        int b= a.length;
        int k = 2;
        rotate(a, b, k);

    }
}
