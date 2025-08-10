package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int x=0;x<n;x++){
                System.out.print(arr[x]+" ");
            }
            System.out.println();
        }

        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
