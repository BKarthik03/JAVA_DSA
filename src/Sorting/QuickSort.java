package Sorting;

import java.util.Scanner;

public class QuickSort {
    static int quick(int a[], int low, int high){
        int p = a[low];
        int i = low;
        int j = high;

        while(i<j){
            while(a[i]<=p && i<=high-1)
                i++;

            while(a[j]>p && j>=low+1)
                j--;

            if(i<j){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        for (int x : a) {
            System.out.print(x+" ");
        }
        System.out.println(j);
        return j;
    }


    static void quickSort(int a[], int low, int high){
        if(low<high){
            int p = quick(a, low, high);
            quickSort(a, low, p-1);
            quickSort(a, p+1, high);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
