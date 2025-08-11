package Arrays.Easy;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0], secLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println(largest+" is the largest, "+secLargest+" is the second largest");
    }
}