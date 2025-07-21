package Recursion;

import java.util.Scanner;

public class ReverseArray {
    static void reverseArray(int a[], int start, int end){
        if(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            reverseArray(a,start+1,end-1);
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0 ,n-1);
        System.out.println("The reversed array is: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
