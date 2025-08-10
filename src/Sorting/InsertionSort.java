package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++){
            int init = arr[i];
            int j = i-1;
            while(arr[j]>init && j>=0)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = init;
        }


        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
