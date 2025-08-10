package Sorting;

import java.util.Scanner;

public class MergeSort {
    static void merge(int a[], int low, int mid, int high){
        int temp[] = new int[a.length];
        int index = 0;
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                temp[index++] = a[left];
                left++;
            }
            else{
                temp[index++] = a[right];
                right++;
            }
        }

        while(left<=mid){
            temp[index++] = a[left];
            left++;
        }

        while(right<=high){
            temp[index++] = a[right];
            right++;
        }

        for(int i=low;i<=high;i++){
            a[i] = temp[i-low];
        }
    }

    static  void mergeSort(int a[], int low, int high){
        if(low >= high)
            return;
        int mid = (low+high)/2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a, low, mid, high);
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
        mergeSort(arr,0,n-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
